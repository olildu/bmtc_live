package app.chalo.productpurchase.passpurchase.data.models.api.request;

import defpackage.nf1;
import defpackage.r30;
import defpackage.sr;
import java.util.ArrayList;
import java.util.List;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/CreateSuperPassOrderRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CreateSuperPassOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8320a;
    public final PassProps b;
    public final PaymentProps c;
    public final Map d;
    public final UserDetails e;
    public final List f;
    public final String g;
    public final String h;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/data/models/api/request/CreateSuperPassOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/productpurchase/passpurchase/data/models/api/request/CreateSuperPassOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CreateSuperPassOrderRequestApiModel> serializer() {
            return CreateSuperPassOrderRequestApiModel$$serializer.f8321a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        i = new Lazy[]{null, null, null, LazyKt.a(lazyThreadSafetyMode, new sr(22)), null, LazyKt.a(lazyThreadSafetyMode, new sr(23)), null, null};
    }

    public /* synthetic */ CreateSuperPassOrderRequestApiModel(int i2, String str, PassProps passProps, PaymentProps paymentProps, Map map, UserDetails userDetails, List list, String str2, String str3) {
        if (255 != (i2 & 255)) {
            PluginExceptionsKt.b(CreateSuperPassOrderRequestApiModel$$serializer.f8321a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f8320a = str;
        this.b = passProps;
        this.c = paymentProps;
        this.d = map;
        this.e = userDetails;
        this.f = list;
        this.g = str2;
        this.h = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSuperPassOrderRequestApiModel)) {
            return false;
        }
        CreateSuperPassOrderRequestApiModel createSuperPassOrderRequestApiModel = (CreateSuperPassOrderRequestApiModel) obj;
        return Intrinsics.d(this.f8320a, createSuperPassOrderRequestApiModel.f8320a) && Intrinsics.d(this.b, createSuperPassOrderRequestApiModel.b) && Intrinsics.d(this.c, createSuperPassOrderRequestApiModel.c) && Intrinsics.d(this.d, createSuperPassOrderRequestApiModel.d) && Intrinsics.d(this.e, createSuperPassOrderRequestApiModel.e) && Intrinsics.d(this.f, createSuperPassOrderRequestApiModel.f) && Intrinsics.d(this.g, createSuperPassOrderRequestApiModel.g) && Intrinsics.d(this.h, createSuperPassOrderRequestApiModel.h);
    }

    public final int hashCode() {
        int iE = nf1.e((this.b.hashCode() + (this.f8320a.hashCode() * 31)) * 31, 31, this.c.f8324a);
        Map map = this.d;
        int iB = r30.b((this.e.hashCode() + ((iE + (map == null ? 0 : map.hashCode())) * 31)) * 31, 31, this.f);
        String str = this.g;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.h;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreateSuperPassOrderRequestApiModel(city=");
        sb.append(this.f8320a);
        sb.append(", passProps=");
        sb.append(this.b);
        sb.append(", paymentProps=");
        sb.append(this.c);
        sb.append(", proofs=");
        sb.append(this.d);
        sb.append(", userDetails=");
        sb.append(this.e);
        sb.append(", appliedRules=");
        sb.append(this.f);
        sb.append(", userAcquisitionChannel=");
        return r30.i(sb, this.g, ", userCampaign=", this.h, ")");
    }

    public CreateSuperPassOrderRequestApiModel(String str, PassProps passProps, PaymentProps paymentProps, Map map, UserDetails userDetails, ArrayList arrayList, String str2, String str3) {
        this.f8320a = str;
        this.b = passProps;
        this.c = paymentProps;
        this.d = map;
        this.e = userDetails;
        this.f = arrayList;
        this.g = str2;
        this.h = str3;
    }
}
