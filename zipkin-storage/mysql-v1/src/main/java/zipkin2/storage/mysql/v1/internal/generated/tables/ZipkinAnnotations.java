/*
 * This file is generated by jOOQ.
 */
package zipkin2.storage.mysql.v1.internal.generated.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;

import zipkin2.storage.mysql.v1.internal.generated.Indexes;
import zipkin2.storage.mysql.v1.internal.generated.Keys;
import zipkin2.storage.mysql.v1.internal.generated.Zipkin;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ZipkinAnnotations extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>zipkin.zipkin_annotations</code>
     */
    public static final ZipkinAnnotations ZIPKIN_ANNOTATIONS = new ZipkinAnnotations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>zipkin.zipkin_annotations.trace_id_high</code>. If non zero, this means the trace uses 128 bit traceIds instead of 64 bit
     */
    public final TableField<Record, Long> TRACE_ID_HIGH = createField(DSL.name("trace_id_high"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "If non zero, this means the trace uses 128 bit traceIds instead of 64 bit");

    /**
     * The column <code>zipkin.zipkin_annotations.trace_id</code>. coincides with zipkin_spans.trace_id
     */
    public final TableField<Record, Long> TRACE_ID = createField(DSL.name("trace_id"), SQLDataType.BIGINT.nullable(false), this, "coincides with zipkin_spans.trace_id");

    /**
     * The column <code>zipkin.zipkin_annotations.span_id</code>. coincides with zipkin_spans.id
     */
    public final TableField<Record, Long> SPAN_ID = createField(DSL.name("span_id"), SQLDataType.BIGINT.nullable(false), this, "coincides with zipkin_spans.id");

    /**
     * The column <code>zipkin.zipkin_annotations.a_key</code>. BinaryAnnotation.key or Annotation.value if type == -1
     */
    public final TableField<Record, String> A_KEY = createField(DSL.name("a_key"), SQLDataType.VARCHAR(255).nullable(false), this, "BinaryAnnotation.key or Annotation.value if type == -1");

    /**
     * The column <code>zipkin.zipkin_annotations.a_value</code>. BinaryAnnotation.value(), which must be smaller than 64KB
     */
    public final TableField<Record, byte[]> A_VALUE = createField(DSL.name("a_value"), SQLDataType.BLOB, this, "BinaryAnnotation.value(), which must be smaller than 64KB");

    /**
     * The column <code>zipkin.zipkin_annotations.a_type</code>. BinaryAnnotation.type() or -1 if Annotation
     */
    public final TableField<Record, Integer> A_TYPE = createField(DSL.name("a_type"), SQLDataType.INTEGER.nullable(false), this, "BinaryAnnotation.type() or -1 if Annotation");

    /**
     * The column <code>zipkin.zipkin_annotations.a_timestamp</code>. Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp
     */
    public final TableField<Record, Long> A_TIMESTAMP = createField(DSL.name("a_timestamp"), SQLDataType.BIGINT, this, "Used to implement TTL; Annotation.timestamp or zipkin_spans.timestamp");

    /**
     * The column <code>zipkin.zipkin_annotations.endpoint_ipv4</code>. Null when Binary/Annotation.endpoint is null
     */
    public final TableField<Record, Integer> ENDPOINT_IPV4 = createField(DSL.name("endpoint_ipv4"), SQLDataType.INTEGER, this, "Null when Binary/Annotation.endpoint is null");

    /**
     * The column <code>zipkin.zipkin_annotations.endpoint_ipv6</code>. Null when Binary/Annotation.endpoint is null, or no IPv6 address
     */
    public final TableField<Record, byte[]> ENDPOINT_IPV6 = createField(DSL.name("endpoint_ipv6"), SQLDataType.BINARY(16), this, "Null when Binary/Annotation.endpoint is null, or no IPv6 address");

    /**
     * The column <code>zipkin.zipkin_annotations.endpoint_port</code>. Null when Binary/Annotation.endpoint is null
     */
    public final TableField<Record, Short> ENDPOINT_PORT = createField(DSL.name("endpoint_port"), SQLDataType.SMALLINT, this, "Null when Binary/Annotation.endpoint is null");

    /**
     * The column <code>zipkin.zipkin_annotations.endpoint_service_name</code>. Null when Binary/Annotation.endpoint is null
     */
    public final TableField<Record, String> ENDPOINT_SERVICE_NAME = createField(DSL.name("endpoint_service_name"), SQLDataType.VARCHAR(255), this, "Null when Binary/Annotation.endpoint is null");

    private ZipkinAnnotations(Name alias, Table<Record> aliased) {
        this(alias, aliased, null);
    }

    private ZipkinAnnotations(Name alias, Table<Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>zipkin.zipkin_annotations</code> table reference
     */
    public ZipkinAnnotations(String alias) {
        this(DSL.name(alias), ZIPKIN_ANNOTATIONS);
    }

    /**
     * Create an aliased <code>zipkin.zipkin_annotations</code> table reference
     */
    public ZipkinAnnotations(Name alias) {
        this(alias, ZIPKIN_ANNOTATIONS);
    }

    /**
     * Create a <code>zipkin.zipkin_annotations</code> table reference
     */
    public ZipkinAnnotations() {
        this(DSL.name("zipkin_annotations"), null);
    }

    public <O extends Record> ZipkinAnnotations(Table<O> child, ForeignKey<O, Record> key) {
        super(child, key, ZIPKIN_ANNOTATIONS);
    }

    @Override
    public Schema getSchema() {
        return Zipkin.ZIPKIN;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.ZIPKIN_ANNOTATIONS_A_KEY, Indexes.ZIPKIN_ANNOTATIONS_A_TYPE, Indexes.ZIPKIN_ANNOTATIONS_ENDPOINT_SERVICE_NAME, Indexes.ZIPKIN_ANNOTATIONS_TRACE_ID, Indexes.ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH_2, Indexes.ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH_3);
    }

    @Override
    public List<UniqueKey<Record>> getKeys() {
        return Arrays.<UniqueKey<Record>>asList(Keys.KEY_ZIPKIN_ANNOTATIONS_TRACE_ID_HIGH);
    }

    @Override
    public ZipkinAnnotations as(String alias) {
        return new ZipkinAnnotations(DSL.name(alias), this);
    }

    @Override
    public ZipkinAnnotations as(Name alias) {
        return new ZipkinAnnotations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public ZipkinAnnotations rename(String name) {
        return new ZipkinAnnotations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ZipkinAnnotations rename(Name name) {
        return new ZipkinAnnotations(name, null);
    }
}
