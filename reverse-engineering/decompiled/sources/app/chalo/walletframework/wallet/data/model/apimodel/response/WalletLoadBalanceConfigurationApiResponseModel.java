package app.chalo.walletframework.wallet.data.model.apimodel.response;

import defpackage.cb0;
import defpackage.dd;
import defpackage.gf;
import defpackage.pk0;
import defpackage.vo1;
import defpackage.yn1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigurationApiResponseModel;", "", "Companion", "$serializer", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class WalletLoadBalanceConfigurationApiResponseModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] n = {null, null, null, LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new yn1(29)), null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10991a;
    public final String b;
    public final String c;
    public final List d;
    public final String e;
    public final Boolean f;
    public final Integer g;
    public final Integer h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigurationApiResponseModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/walletframework/wallet/data/model/apimodel/response/WalletLoadBalanceConfigurationApiResponseModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "framework-wallet_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<WalletLoadBalanceConfigurationApiResponseModel> serializer() {
            return WalletLoadBalanceConfigurationApiResponseModel$$serializer.f10992a;
        }
    }

    public /* synthetic */ WalletLoadBalanceConfigurationApiResponseModel(int i, String str, String str2, String str3, List list, String str4, Boolean bool, Integer num, Integer num2, String str5, String str6, String str7, String str8, String str9) {
        if (8159 != (i & 8159)) {
            PluginExceptionsKt.b(WalletLoadBalanceConfigurationApiResponseModel$$serializer.f10992a.getDescriptor(), i, 8159);
            throw null;
        }
        this.f10991a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = str4;
        if ((i & 32) == 0) {
            this.f = Boolean.TRUE;
        } else {
            this.f = bool;
        }
        this.g = num;
        this.h = num2;
        this.i = str5;
        this.j = str6;
        this.k = str7;
        this.l = str8;
        this.m = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WalletLoadBalanceConfigurationApiResponseModel)) {
            return false;
        }
        WalletLoadBalanceConfigurationApiResponseModel walletLoadBalanceConfigurationApiResponseModel = (WalletLoadBalanceConfigurationApiResponseModel) obj;
        return Intrinsics.d(this.f10991a, walletLoadBalanceConfigurationApiResponseModel.f10991a) && Intrinsics.d(this.b, walletLoadBalanceConfigurationApiResponseModel.b) && Intrinsics.d(this.c, walletLoadBalanceConfigurationApiResponseModel.c) && Intrinsics.d(this.d, walletLoadBalanceConfigurationApiResponseModel.d) && Intrinsics.d(this.e, walletLoadBalanceConfigurationApiResponseModel.e) && Intrinsics.d(this.f, walletLoadBalanceConfigurationApiResponseModel.f) && Intrinsics.d(this.g, walletLoadBalanceConfigurationApiResponseModel.g) && Intrinsics.d(this.h, walletLoadBalanceConfigurationApiResponseModel.h) && Intrinsics.d(this.i, walletLoadBalanceConfigurationApiResponseModel.i) && Intrinsics.d(this.j, walletLoadBalanceConfigurationApiResponseModel.j) && Intrinsics.d(this.k, walletLoadBalanceConfigurationApiResponseModel.k) && Intrinsics.d(this.l, walletLoadBalanceConfigurationApiResponseModel.l) && Intrinsics.d(this.m, walletLoadBalanceConfigurationApiResponseModel.m);
    }

    public final int hashCode() {
        String str = this.f10991a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.h;
        int iHashCode8 = (iHashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str5 = this.i;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.j;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.k;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.l;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.m;
        return iHashCode12 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("WalletLoadBalanceConfigurationApiResponseModel(configId=", this.f10991a, ", city=", this.b, ", name=");
        pk0.w(this.c, ", termsAndConditions=", ", agency=", sbE, this.d);
        gf.v(this.f, this.e, ", isActive=", ", minAppVer=", sbE);
        pk0.y(sbE, this.g, ", maxAppVer=", this.h, ", productType=");
        cb0.t(sbE, this.i, ", productSubType=", this.j, ", finalBeneficiary=");
        cb0.t(sbE, this.k, ", intermediateBeneficiary=", this.l, ", revenueRecognitionLogic=");
        return vo1.p(sbE, this.m, ")");
    }
}
