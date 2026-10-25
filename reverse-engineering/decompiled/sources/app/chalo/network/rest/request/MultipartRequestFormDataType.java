package app.chalo.network.rest.request;

import defpackage.jk0;
import defpackage.vo1;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0005\u0002\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestFormDataType;", "", "Companion", "StringData", "NumberData", "ByteArrayData", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType$ByteArrayData;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType$NumberData;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType$StringData;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public abstract class MultipartRequestFormDataType {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Object b = LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new jk0(0));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6518a;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestFormDataType$ByteArrayData;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ByteArrayData extends MultipartRequestFormDataType {
        public final String c;
        public final byte[] d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByteArrayData(String str, byte[] data) {
            super(str);
            Intrinsics.i(data, "data");
            this.c = str;
            this.d = data;
        }

        @Override // app.chalo.network.rest.request.MultipartRequestFormDataType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF6518a() {
            return this.c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestFormDataType$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType;", "serializer", "()Lkotlinx/serialization/KSerializer;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        public final KSerializer<MultipartRequestFormDataType> serializer() {
            return (KSerializer) MultipartRequestFormDataType.b.getValue();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestFormDataType$NumberData;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NumberData extends MultipartRequestFormDataType {
        @Override // app.chalo.network.rest.request.MultipartRequestFormDataType
        /* JADX INFO: renamed from: a */
        public final String getF6518a() {
            return null;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof NumberData);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "NumberData(key=null, fileName=null, data=null)";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/network/rest/request/MultipartRequestFormDataType$StringData;", "Lapp/chalo/network/rest/request/MultipartRequestFormDataType;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StringData extends MultipartRequestFormDataType {
        public final String c;

        public StringData(String str) {
            super(null);
            this.c = str;
        }

        @Override // app.chalo.network.rest.request.MultipartRequestFormDataType
        /* JADX INFO: renamed from: a */
        public final String getF6518a() {
            return null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StringData) && this.c.equals(((StringData) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (100348178 * 31);
        }

        public final String toString() {
            return vo1.B("StringData(key=info, fileName=null, data=", this.c, ")");
        }
    }

    public MultipartRequestFormDataType(String str) {
        this.f6518a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public String getF6518a() {
        return this.f6518a;
    }
}
