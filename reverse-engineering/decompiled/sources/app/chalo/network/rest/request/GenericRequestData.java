package app.chalo.network.rest.request;

import defpackage.cb0;
import defpackage.t40;
import defpackage.vo1;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0017\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/network/rest/request/GenericRequestData;", "", "Companion", "$serializer", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public class GenericRequestData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6515a;
    public String b;
    public String c;
    public String d;
    public final HashMap e;
    public final Map f;
    public final HashMap g;
    public final String h;
    public String i;
    public final String j;
    public int k;
    public String l;
    public Integer m;
    public Integer n;
    public Integer o;
    public int p;
    public String q;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lapp/chalo/network/rest/request/GenericRequestData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/network/rest/request/GenericRequestData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "APPLICATION_JSON", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public static final String a(Companion companion, String str, Map map) {
            companion.getClass();
            if (str != null && str.length() != 0) {
                if (map == null) {
                    return str;
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    str = StringsKt.R(str, "{" + str2 + "}", (String) entry.getValue());
                }
            }
            return str;
        }

        public static boolean b(Map map) {
            Set<Map.Entry> setEntrySet;
            if (map == null || (setEntrySet = map.entrySet()) == null) {
                return true;
            }
            for (Map.Entry entry : setEntrySet) {
                Companion companion = GenericRequestData.INSTANCE;
                if (entry.getKey() == null || entry.getValue() == null) {
                    return false;
                }
            }
            return true;
        }

        public final KSerializer<GenericRequestData> serializer() {
            return GenericRequestData$$serializer.f6516a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        r = new Lazy[]{null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new t40(19)), LazyKt.a(lazyThreadSafetyMode, new t40(20)), LazyKt.a(lazyThreadSafetyMode, new t40(21)), null, null, null, null, null, null, null, null, null, null};
    }

    public GenericRequestData() {
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new HashMap();
        this.q = "LINEAR_BACKOFF";
        this.h = "application/json";
        this.d = HttpRequestType.GET.getHttpRequestType();
    }

    public static final /* synthetic */ void b(GenericRequestData genericRequestData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || genericRequestData.a() != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.f18170a, genericRequestData.a());
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || genericRequestData.b != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.f18170a, genericRequestData.b);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || genericRequestData.c != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.f18170a, genericRequestData.c);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || genericRequestData.d != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.f18170a, genericRequestData.d);
        }
        boolean zShouldEncodeElementDefault = compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4);
        Lazy[] lazyArr = r;
        if (zShouldEncodeElementDefault || !Intrinsics.d(genericRequestData.e, new HashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, (SerializationStrategy) lazyArr[4].getValue(), genericRequestData.e);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.d(genericRequestData.f, new HashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, (SerializationStrategy) lazyArr[5].getValue(), genericRequestData.f);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.d(genericRequestData.g, new HashMap())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 6, (SerializationStrategy) lazyArr[6].getValue(), genericRequestData.g);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || genericRequestData.h != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.f18170a, genericRequestData.h);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || genericRequestData.i != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.f18170a, genericRequestData.i);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || genericRequestData.j != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.f18170a, genericRequestData.j);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || genericRequestData.k != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, genericRequestData.k);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || genericRequestData.l != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, StringSerializer.f18170a, genericRequestData.l);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || genericRequestData.m != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.f18146a, genericRequestData.m);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || genericRequestData.n != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.f18146a, genericRequestData.n);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || genericRequestData.o != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.f18146a, genericRequestData.o);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || genericRequestData.p != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 15, genericRequestData.p);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.d(genericRequestData.q, "LINEAR_BACKOFF")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.f18170a, genericRequestData.q);
    }

    public final String a() {
        String str;
        String str2 = this.f6515a;
        if (str2 != null) {
            return str2;
        }
        String str3 = this.c;
        if (str3 != null && (str = this.b) != null) {
            return vo1.n(str, "/", str3);
        }
        String str4 = this.b;
        if (str4 != null) {
            return str4;
        }
        return null;
    }

    public final String toString() {
        String strA = a();
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String str4 = this.i;
        int i = this.k;
        String str5 = this.l;
        StringBuilder sb = new StringBuilder();
        sb.append(strA);
        sb.append(" ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        sb.append(" ");
        sb.append(this.e);
        sb.append(" ");
        sb.append(this.f);
        sb.append(" ");
        sb.append(this.g);
        cb0.t(sb, " ", str4, " ", this.h);
        cb0.o(i, this.j, " ", " ", sb);
        sb.append(str5);
        return sb.toString();
    }

    public /* synthetic */ GenericRequestData(int i, String str, String str2, String str3, String str4, HashMap map, Map map2, HashMap map3, String str5, String str6, String str7, int i2, String str8, Integer num, Integer num2, Integer num3, int i3, String str9) {
        if ((i & 1) == 0) {
            this.f6515a = null;
        } else {
            this.f6515a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = new HashMap();
        } else {
            this.e = map;
        }
        if ((i & 32) == 0) {
            this.f = new HashMap();
        } else {
            this.f = map2;
        }
        if ((i & 64) == 0) {
            this.g = new HashMap();
        } else {
            this.g = map3;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str6;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = str7;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i2;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = str8;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = num;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num2;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = num3;
        }
        if ((32768 & i) == 0) {
            this.p = 0;
        } else {
            this.p = i3;
        }
        this.q = (i & 65536) == 0 ? "LINEAR_BACKOFF" : str9;
        this.h = "application/json";
        this.d = HttpRequestType.GET.getHttpRequestType();
    }
}
