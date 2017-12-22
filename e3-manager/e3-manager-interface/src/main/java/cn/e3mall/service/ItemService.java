package cn.e3mall.service;

import cn.e3mall.common.pojo.DataResult;
import cn.e3mall.pojo.TbItem;

public interface ItemService {

	public TbItem selectByPrimaryKey(long id);

	public DataResult getItemList(int page, int rows);
}
