package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.nf1;
import defpackage.r30;
import defpackage.wb;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/BottomTabApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class BottomTabApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new wb(14)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2878a;
    public final List b;
    public final String c;
    public final String d;
    public final String e;
    public final TabMetaDataApiModel f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/BottomTabApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/BottomTabApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<BottomTabApiModel> serializer() {
            return BottomTabApiModel$$serializer.f2879a;
        }
    }

    public /* synthetic */ BottomTabApiModel(int i, int i2, List list, String str, String str2, String str3, TabMetaDataApiModel tabMetaDataApiModel) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(BottomTabApiModel$$serializer.f2879a.getDescriptor(), i, 63);
            throw null;
        }
        this.f2878a = i2;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = tabMetaDataApiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomTabApiModel)) {
            return false;
        }
        BottomTabApiModel bottomTabApiModel = (BottomTabApiModel) obj;
        return this.f2878a == bottomTabApiModel.f2878a && Intrinsics.d(this.b, bottomTabApiModel.b) && Intrinsics.d(this.c, bottomTabApiModel.c) && Intrinsics.d(this.d, bottomTabApiModel.d) && Intrinsics.d(this.e, bottomTabApiModel.e) && Intrinsics.d(this.f, bottomTabApiModel.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + nf1.e(nf1.e(nf1.e(r30.b(this.f2878a * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomTabApiModel(position=");
        sb.append(this.f2878a);
        sb.append(", sections=");
        sb.append(this.b);
        sb.append(", tabId=");
        cb0.t(sb, this.c, ", tabName=", this.d, ", tabType=");
        sb.append(this.e);
        sb.append(", tabMetaData=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
