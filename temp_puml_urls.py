import zlib
from pathlib import Path
base = Path(r'D:\shipin\demo01helloword-SpringMVC\demo01helloword\docs\uml')
files=['use_case.puml','architecture.puml','class_diagram.puml','activity_diagram.puml','er_diagram.puml','sequence_diagram.puml','gantt_chart.puml']
for fname in files:
    path = base / fname
    text = path.read_text(encoding='utf-8')
    if text.startswith('\ufeff'):
        text = text[1:]
    data = zlib.compress(text.encode('utf-8'))
    data = data[2:-4]
    table = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz-_"
    def append3bytes(b1,b2,b3):
        c1 = b1 >> 2
        c2 = ((b1 & 0x3) << 4) | (b2 >> 4)
        c3 = ((b2 & 0xF) << 2) | (b3 >> 6)
        c4 = b3 & 0x3F
        return ''.join(table[c] for c in (c1,c2,c3,c4))
    res=[]
    i=0
    while i < len(data):
        b1 = data[i]
        b2 = data[i+1] if i+1 < len(data) else 0
        b3 = data[i+2] if i+2 < len(data) else 0
        res.append(append3bytes(b1,b2,b3))
        i += 3
    url='https://www.plantuml.com/plantuml/png/' + ''.join(res)
    print(fname, url)
