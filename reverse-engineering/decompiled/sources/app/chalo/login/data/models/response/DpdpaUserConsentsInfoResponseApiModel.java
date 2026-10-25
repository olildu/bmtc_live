package app.chalo.login.data.models.response;

import defpackage.dd;
import defpackage.uf0;
import defpackage.yv;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/login/data/models/response/DpdpaUserConsentsInfoResponseApiModel;", "", "Companion", "$serializer", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class DpdpaUserConsentsInfoResponseApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] g = {null, null, null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yv(15))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5213a;
    public final String b;
    public final Integer c;
    public final Long d;
    public final String e;
    public final List f;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/data/models/response/DpdpaUserConsentsInfoResponseApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/login/data/models/response/DpdpaUserConsentsInfoResponseApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<DpdpaUserConsentsInfoResponseApiModel> serializer() {
            return DpdpaUserConsentsInfoResponseApiModel$$serializer.f5214a;
        }
    }

    public /* synthetic */ DpdpaUserConsentsInfoResponseApiModel(int i, String str, String str2, Integer num, Long l, String str3, List list) {
        if (63 != (i & 63)) {
            PluginExceptionsKt.b(DpdpaUserConsentsInfoResponseApiModel$$serializer.f5214a.getDescriptor(), i, 63);
            throw null;
        }
        this.f5213a = str;
        this.b = str2;
        this.c = num;
        this.d = l;
        this.e = str3;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DpdpaUserConsentsInfoResponseApiModel)) {
            return false;
        }
        DpdpaUserConsentsInfoResponseApiModel dpdpaUserConsentsInfoResponseApiModel = (DpdpaUserConsentsInfoResponseApiModel) obj;
        return Intrinsics.d(this.f5213a, dpdpaUserConsentsInfoResponseApiModel.f5213a) && Intrinsics.d(this.b, dpdpaUserConsentsInfoResponseApiModel.b) && Intrinsics.d(this.c, dpdpaUserConsentsInfoResponseApiModel.c) && Intrinsics.d(this.d, dpdpaUserConsentsInfoResponseApiModel.d) && Intrinsics.d(this.e, dpdpaUserConsentsInfoResponseApiModel.e) && Intrinsics.d(this.f, dpdpaUserConsentsInfoResponseApiModel.f);
    }

    public final int hashCode() {
        String str = this.f5213a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.d;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("DpdpaUserConsentsInfoResponseApiModel(userId=", this.f5213a, ", deviceId=", this.b, ", policyVersion=");
        sbE.append(this.c);
        sbE.append(", lastConsentUpdatedAt=");
        sbE.append(this.d);
        sbE.append(", tncUrl=");
        return uf0.p(this.e, ", consents=", ")", sbE, this.f);
    }
}
