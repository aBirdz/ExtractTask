# ExtractTask
extract data by jdbc timing

入库时间跟时间字段更新时间有差异，导致flume抽取异常。还待修复

Update
2016-5-26
单条插入处理多条数据入库时间不能保证同步，改为批处理
