package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.pk0;
import defpackage.t10;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigSubCategoryResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigSubCategoryResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8644a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigSubCategoryResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigSubCategoryResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigSubCategoryResponseAppModel> serializer() {
            return SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a;
        }
    }

    public /* synthetic */ SuperPassProductConfigSubCategoryResponseAppModel(int i, String str, String str2, String str3, boolean z, boolean z2, String str4, String str5, String str6, String str7, boolean z3) {
        if (455 != (i & 455)) {
            PluginExceptionsKt.b(SuperPassProductConfigSubCategoryResponseAppModel$$serializer.f8645a.getDescriptor(), i, 455);
            throw null;
        }
        this.f8644a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = true;
        } else {
            this.d = z;
        }
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z2;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str4;
        }
        this.g = str5;
        this.h = str6;
        this.i = str7;
        if ((i & 512) == 0) {
            this.j = false;
        } else {
            this.j = z3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigSubCategoryResponseAppModel)) {
            return false;
        }
        SuperPassProductConfigSubCategoryResponseAppModel superPassProductConfigSubCategoryResponseAppModel = (SuperPassProductConfigSubCategoryResponseAppModel) obj;
        return Intrinsics.d(this.f8644a, superPassProductConfigSubCategoryResponseAppModel.f8644a) && Intrinsics.d(this.b, superPassProductConfigSubCategoryResponseAppModel.b) && Intrinsics.d(this.c, superPassProductConfigSubCategoryResponseAppModel.c) && this.d == superPassProductConfigSubCategoryResponseAppModel.d && this.e == superPassProductConfigSubCategoryResponseAppModel.e && Intrinsics.d(this.f, superPassProductConfigSubCategoryResponseAppModel.f) && Intrinsics.d(this.g, superPassProductConfigSubCategoryResponseAppModel.g) && Intrinsics.d(this.h, superPassProductConfigSubCategoryResponseAppModel.h) && Intrinsics.d(this.i, superPassProductConfigSubCategoryResponseAppModel.i) && this.j == superPassProductConfigSubCategoryResponseAppModel.j;
    }

    public final int hashCode() {
        int iE = nf1.e(this.f8644a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE2 = nf1.e((((((iE + (str == null ? 0 : str.hashCode())) * 31) + (this.d ? 1231 : 1237)) * 31) + (this.e ? 1231 : 1237)) * 31, 31, this.f);
        String str2 = this.g;
        int iHashCode = (iE2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        return ((iHashCode2 + (str4 != null ? str4.hashCode() : 0)) * 31) + (this.j ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("SuperPassProductConfigSubCategoryResponseAppModel(id=", this.f8644a, ", name=", this.b, ", infoNote=");
        t10.s(this.c, ", isActive=", ", isVisible=", sbE, this.d);
        pk0.x(", plansTitle=", this.f, ", additionalInfo=", sbE, this.e);
        cb0.t(sbE, this.g, ", announcement=", this.h, ", inactiveReason=");
        sbE.append(this.i);
        sbE.append(", hideSpecialFeatureTags=");
        sbE.append(this.j);
        sbE.append(")");
        return sbE.toString();
    }

    public SuperPassProductConfigSubCategoryResponseAppModel(String id, String name, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, boolean z3) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        this.f8644a = id;
        this.b = name;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = z3;
    }
}
