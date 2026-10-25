package app.chalo.ncmc.data.apirequestmodel;

import defpackage.cb0;
import defpackage.dd;
import defpackage.nf1;
import defpackage.vo1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apirequestmodel/IntentHashResponseApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class IntentHashResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6061a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apirequestmodel/IntentHashResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apirequestmodel/IntentHashResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<IntentHashResponseApiModel> serializer() {
            return IntentHashResponseApiModel$$serializer.f6062a;
        }
    }

    public /* synthetic */ IntentHashResponseApiModel(int i, String str, String str2, String str3, String str4, String str5) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(IntentHashResponseApiModel$$serializer.f6062a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6061a = str;
        this.b = str2;
        this.c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IntentHashResponseApiModel)) {
            return false;
        }
        IntentHashResponseApiModel intentHashResponseApiModel = (IntentHashResponseApiModel) obj;
        return Intrinsics.d(this.f6061a, intentHashResponseApiModel.f6061a) && Intrinsics.d(this.b, intentHashResponseApiModel.b) && Intrinsics.d(this.c, intentHashResponseApiModel.c) && Intrinsics.d(this.d, intentHashResponseApiModel.d) && Intrinsics.d(this.e, intentHashResponseApiModel.e);
    }

    public final int hashCode() {
        int iE = nf1.e(nf1.e(this.f6061a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("IntentHashResponseApiModel(hash=", this.f6061a, ", invoiceNumber=", this.b, ", subUserId=");
        cb0.t(sbE, this.c, ", serviceId=", this.d, ", serviceManagementInfo=");
        return vo1.p(sbE, this.e, ")");
    }
}
