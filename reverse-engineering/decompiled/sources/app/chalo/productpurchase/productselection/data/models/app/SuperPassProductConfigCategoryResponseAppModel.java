package app.chalo.productpurchase.productselection.data.models.app;

import defpackage.nf1;
import defpackage.pk0;
import defpackage.r30;
import defpackage.t10;
import defpackage.tf1;
import defpackage.vo1;
import defpackage.xs;
import defpackage.z40;
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
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigCategoryResponseAppModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class SuperPassProductConfigCategoryResponseAppModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] l = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new tf1(4)), null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8639a;
    public final int b;
    public final String c;
    public final List d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;
    public final boolean j;
    public final String k;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigCategoryResponseAppModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/app/SuperPassProductConfigCategoryResponseAppModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<SuperPassProductConfigCategoryResponseAppModel> serializer() {
            return SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a;
        }
    }

    public /* synthetic */ SuperPassProductConfigCategoryResponseAppModel(int i, String str, int i2, String str2, List list, boolean z, boolean z2, boolean z3, String str3, String str4, boolean z4, String str5) {
        if (1423 != (i & 1423)) {
            PluginExceptionsKt.b(SuperPassProductConfigCategoryResponseAppModel$$serializer.f8640a.getDescriptor(), i, 1423);
            throw null;
        }
        this.f8639a = str;
        this.b = i2;
        this.c = str2;
        this.d = list;
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z2;
        }
        if ((i & 64) == 0) {
            this.g = false;
        } else {
            this.g = z3;
        }
        this.h = str3;
        this.i = str4;
        if ((i & 512) == 0) {
            this.j = true;
        } else {
            this.j = z4;
        }
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperPassProductConfigCategoryResponseAppModel)) {
            return false;
        }
        SuperPassProductConfigCategoryResponseAppModel superPassProductConfigCategoryResponseAppModel = (SuperPassProductConfigCategoryResponseAppModel) obj;
        return Intrinsics.d(this.f8639a, superPassProductConfigCategoryResponseAppModel.f8639a) && this.b == superPassProductConfigCategoryResponseAppModel.b && Intrinsics.d(this.c, superPassProductConfigCategoryResponseAppModel.c) && Intrinsics.d(this.d, superPassProductConfigCategoryResponseAppModel.d) && this.e == superPassProductConfigCategoryResponseAppModel.e && this.f == superPassProductConfigCategoryResponseAppModel.f && this.g == superPassProductConfigCategoryResponseAppModel.g && Intrinsics.d(this.h, superPassProductConfigCategoryResponseAppModel.h) && Intrinsics.d(this.i, superPassProductConfigCategoryResponseAppModel.i) && this.j == superPassProductConfigCategoryResponseAppModel.j && Intrinsics.d(this.k, superPassProductConfigCategoryResponseAppModel.k);
    }

    public final int hashCode() {
        int iB = (((((r30.b(nf1.e(((this.f8639a.hashCode() * 31) + this.b) * 31, 31, this.c), 31, this.d) + (this.e ? 1231 : 1237)) * 31) + (this.f ? 1231 : 1237)) * 31) + (this.g ? 1231 : 1237)) * 31;
        String str = this.h;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int iHashCode2 = (((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + (this.j ? 1231 : 1237)) * 31;
        String str3 = this.k;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "SuperPassProductConfigCategoryResponseAppModel(id=", this.f8639a, ", pos=", ", name=");
        pk0.w(this.c, ", proofs=", ", isActive=", sbM, this.d);
        z40.r(sbM, this.e, ", isRenewable=", this.f, ", verification=");
        pk0.x(", infoNote=", this.h, ", inactiveReason=", sbM, this.g);
        t10.s(this.i, ", isVisible=", ", info=", sbM, this.j);
        return vo1.p(sbM, this.k, ")");
    }

    public SuperPassProductConfigCategoryResponseAppModel(String id, int i, String name, List proofs, boolean z, boolean z2, boolean z3, String str, String str2, boolean z4, String str3) {
        Intrinsics.i(id, "id");
        Intrinsics.i(name, "name");
        Intrinsics.i(proofs, "proofs");
        this.f8639a = id;
        this.b = i;
        this.c = name;
        this.d = proofs;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str;
        this.i = str2;
        this.j = z4;
        this.k = str3;
    }
}
