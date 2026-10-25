package app.chalo.home.data.model.api;

import defpackage.cb0;
import defpackage.ll1;
import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/home/data/model/api/UiConfigApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class UiConfigApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2910a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/home/data/model/api/UiConfigApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/home/data/model/api/UiConfigApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<UiConfigApiModel> serializer() {
            return UiConfigApiModel$$serializer.f2911a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        g = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new ll1(17)), null, null, null, null, LazyKt.a(lazyThreadSafetyMode, new ll1(18))};
    }

    public /* synthetic */ UiConfigApiModel(int i, List list, String str, String str2, int i2, int i3, List list2) {
        if (59 != (i & 59)) {
            PluginExceptionsKt.b(UiConfigApiModel$$serializer.f2911a.getDescriptor(), i, 59);
            throw null;
        }
        this.f2910a = list;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str2;
        }
        this.d = i2;
        this.e = i3;
        this.f = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UiConfigApiModel)) {
            return false;
        }
        UiConfigApiModel uiConfigApiModel = (UiConfigApiModel) obj;
        return Intrinsics.d(this.f2910a, uiConfigApiModel.f2910a) && Intrinsics.d(this.b, uiConfigApiModel.b) && Intrinsics.d(this.c, uiConfigApiModel.c) && this.d == uiConfigApiModel.d && this.e == uiConfigApiModel.e && Intrinsics.d(this.f, uiConfigApiModel.f);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f2910a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.f.hashCode() + ((((((iE + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + this.e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UiConfigApiModel(bottomTabs=");
        sb.append(this.f2910a);
        sb.append(", cityId=");
        sb.append(this.b);
        sb.append(", busService=");
        cb0.o(this.d, this.c, ", maxAppVer=", ", minAppVer=", sb);
        sb.append(this.e);
        sb.append(", profilePageItems=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
