cd /usr/share/fonts
wget https://mirrors.tuna.tsinghua.edu.cn/adobe-fonts/source-han-sans/SubsetOTF/SourceHanSansCN.zip
wget https://mirrors.tuna.tsinghua.edu.cn/adobe-fonts/source-han-serif/SubsetOTF/SourceHanSerifCN.zip
unzip SourceHanSansCN.zip
unzip SourceHanSerifCN.zip
rm -rf SourceHanSerifCN.zip
rm -rf SourceHanSerifCN.zip

fc-cache -fv