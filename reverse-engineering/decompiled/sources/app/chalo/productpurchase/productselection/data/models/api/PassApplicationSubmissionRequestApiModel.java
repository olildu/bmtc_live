package app.chalo.productpurchase.productselection.data.models.api;

import defpackage.d;
import defpackage.nf1;
import defpackage.to0;
import defpackage.xs;
import java.util.Map;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class PassApplicationSubmissionRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] h = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new to0(15)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8587a;
    public final int b;
    public final String c;
    public final PassApplicationUserDetailsRequestApiModel d;
    public final PassApplicationPropsRequestApiModel e;
    public final Map f;
    public final Boolean g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/productselection/data/models/api/PassApplicationSubmissionRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<PassApplicationSubmissionRequestApiModel> serializer() {
            return PassApplicationSubmissionRequestApiModel$$serializer.f8588a;
        }
    }

    public /* synthetic */ PassApplicationSubmissionRequestApiModel(int i, String str, int i2, String str2, PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel, PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel, Map map, Boolean bool) {
        if (127 != (i & 127)) {
            PluginExceptionsKt.b(PassApplicationSubmissionRequestApiModel$$serializer.f8588a.getDescriptor(), i, 127);
            throw null;
        }
        this.f8587a = str;
        this.b = i2;
        this.c = str2;
        this.d = passApplicationUserDetailsRequestApiModel;
        this.e = passApplicationPropsRequestApiModel;
        this.f = map;
        this.g = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PassApplicationSubmissionRequestApiModel)) {
            return false;
        }
        PassApplicationSubmissionRequestApiModel passApplicationSubmissionRequestApiModel = (PassApplicationSubmissionRequestApiModel) obj;
        return Intrinsics.d(this.f8587a, passApplicationSubmissionRequestApiModel.f8587a) && this.b == passApplicationSubmissionRequestApiModel.b && Intrinsics.d(this.c, passApplicationSubmissionRequestApiModel.c) && Intrinsics.d(this.d, passApplicationSubmissionRequestApiModel.d) && Intrinsics.d(this.e, passApplicationSubmissionRequestApiModel.e) && Intrinsics.d(this.f, passApplicationSubmissionRequestApiModel.f) && Intrinsics.d(this.g, passApplicationSubmissionRequestApiModel.g);
    }

    public final int hashCode() {
        int iF = d.f(this.f, (this.e.hashCode() + ((this.d.hashCode() + nf1.e(((this.f8587a.hashCode() * 31) + this.b) * 31, 31, this.c)) * 31)) * 31, 31);
        Boolean bool = this.g;
        return iF + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder sbM = xs.m(this.b, "PassApplicationSubmissionRequestApiModel(city=", this.f8587a, ", appVer=", ", deviceId=");
        sbM.append(this.c);
        sbM.append(", userDetails=");
        sbM.append(this.d);
        sbM.append(", passProps=");
        sbM.append(this.e);
        sbM.append(", proofs=");
        sbM.append(this.f);
        sbM.append(", isReApplication=");
        sbM.append(this.g);
        sbM.append(")");
        return sbM.toString();
    }

    public PassApplicationSubmissionRequestApiModel(String str, int i, String deviceId, PassApplicationUserDetailsRequestApiModel passApplicationUserDetailsRequestApiModel, PassApplicationPropsRequestApiModel passApplicationPropsRequestApiModel, Map proofs, Boolean bool) {
        Intrinsics.i(deviceId, "deviceId");
        Intrinsics.i(proofs, "proofs");
        this.f8587a = str;
        this.b = i;
        this.c = deviceId;
        this.d = passApplicationUserDetailsRequestApiModel;
        this.e = passApplicationPropsRequestApiModel;
        this.f = proofs;
        this.g = bool;
    }
}
