package cn.bdqn.pojo;

import java.util.ArrayList;
import java.util.List;

public class CommentsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommentsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andCommentsIdIsNull() {
            addCriterion("comments_id is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIsNotNull() {
            addCriterion("comments_id is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsIdEqualTo(Integer value) {
            addCriterion("comments_id =", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotEqualTo(Integer value) {
            addCriterion("comments_id <>", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThan(Integer value) {
            addCriterion("comments_id >", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_id >=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThan(Integer value) {
            addCriterion("comments_id <", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdLessThanOrEqualTo(Integer value) {
            addCriterion("comments_id <=", value, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdIn(List<Integer> values) {
            addCriterion("comments_id in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotIn(List<Integer> values) {
            addCriterion("comments_id not in", values, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdBetween(Integer value1, Integer value2) {
            addCriterion("comments_id between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_id not between", value1, value2, "commentsId");
            return (Criteria) this;
        }

        public Criteria andCommentsContIsNull() {
            addCriterion("comments_cont is null");
            return (Criteria) this;
        }

        public Criteria andCommentsContIsNotNull() {
            addCriterion("comments_cont is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsContEqualTo(String value) {
            addCriterion("comments_cont =", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContNotEqualTo(String value) {
            addCriterion("comments_cont <>", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContGreaterThan(String value) {
            addCriterion("comments_cont >", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContGreaterThanOrEqualTo(String value) {
            addCriterion("comments_cont >=", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContLessThan(String value) {
            addCriterion("comments_cont <", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContLessThanOrEqualTo(String value) {
            addCriterion("comments_cont <=", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContLike(String value) {
            addCriterion("comments_cont like", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContNotLike(String value) {
            addCriterion("comments_cont not like", value, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContIn(List<String> values) {
            addCriterion("comments_cont in", values, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContNotIn(List<String> values) {
            addCriterion("comments_cont not in", values, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContBetween(String value1, String value2) {
            addCriterion("comments_cont between", value1, value2, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsContNotBetween(String value1, String value2) {
            addCriterion("comments_cont not between", value1, value2, "commentsCont");
            return (Criteria) this;
        }

        public Criteria andCommentsPathIsNull() {
            addCriterion("comments_path is null");
            return (Criteria) this;
        }

        public Criteria andCommentsPathIsNotNull() {
            addCriterion("comments_path is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsPathEqualTo(String value) {
            addCriterion("comments_path =", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathNotEqualTo(String value) {
            addCriterion("comments_path <>", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathGreaterThan(String value) {
            addCriterion("comments_path >", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathGreaterThanOrEqualTo(String value) {
            addCriterion("comments_path >=", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathLessThan(String value) {
            addCriterion("comments_path <", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathLessThanOrEqualTo(String value) {
            addCriterion("comments_path <=", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathLike(String value) {
            addCriterion("comments_path like", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathNotLike(String value) {
            addCriterion("comments_path not like", value, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathIn(List<String> values) {
            addCriterion("comments_path in", values, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathNotIn(List<String> values) {
            addCriterion("comments_path not in", values, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathBetween(String value1, String value2) {
            addCriterion("comments_path between", value1, value2, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsPathNotBetween(String value1, String value2) {
            addCriterion("comments_path not between", value1, value2, "commentsPath");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidIsNull() {
            addCriterion("comments_shopid is null");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidIsNotNull() {
            addCriterion("comments_shopid is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidEqualTo(String value) {
            addCriterion("comments_shopid =", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidNotEqualTo(String value) {
            addCriterion("comments_shopid <>", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidGreaterThan(String value) {
            addCriterion("comments_shopid >", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidGreaterThanOrEqualTo(String value) {
            addCriterion("comments_shopid >=", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidLessThan(String value) {
            addCriterion("comments_shopid <", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidLessThanOrEqualTo(String value) {
            addCriterion("comments_shopid <=", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidLike(String value) {
            addCriterion("comments_shopid like", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidNotLike(String value) {
            addCriterion("comments_shopid not like", value, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidIn(List<String> values) {
            addCriterion("comments_shopid in", values, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidNotIn(List<String> values) {
            addCriterion("comments_shopid not in", values, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidBetween(String value1, String value2) {
            addCriterion("comments_shopid between", value1, value2, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andCommentsShopidNotBetween(String value1, String value2) {
            addCriterion("comments_shopid not between", value1, value2, "commentsShopid");
            return (Criteria) this;
        }

        public Criteria andComentsHeadIsNull() {
            addCriterion("coments_head is null");
            return (Criteria) this;
        }

        public Criteria andComentsHeadIsNotNull() {
            addCriterion("coments_head is not null");
            return (Criteria) this;
        }

        public Criteria andComentsHeadEqualTo(String value) {
            addCriterion("coments_head =", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadNotEqualTo(String value) {
            addCriterion("coments_head <>", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadGreaterThan(String value) {
            addCriterion("coments_head >", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadGreaterThanOrEqualTo(String value) {
            addCriterion("coments_head >=", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadLessThan(String value) {
            addCriterion("coments_head <", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadLessThanOrEqualTo(String value) {
            addCriterion("coments_head <=", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadLike(String value) {
            addCriterion("coments_head like", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadNotLike(String value) {
            addCriterion("coments_head not like", value, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadIn(List<String> values) {
            addCriterion("coments_head in", values, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadNotIn(List<String> values) {
            addCriterion("coments_head not in", values, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadBetween(String value1, String value2) {
            addCriterion("coments_head between", value1, value2, "comentsHead");
            return (Criteria) this;
        }

        public Criteria andComentsHeadNotBetween(String value1, String value2) {
            addCriterion("coments_head not between", value1, value2, "comentsHead");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}