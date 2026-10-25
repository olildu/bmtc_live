package app.chalo.models;

import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/models/CreateCardRechargeOrderRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CreateCardRechargeOrderRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5580a;
    public final CardProps b;
    public final PaymentProps c;
    public final String d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/models/CreateCardRechargeOrderRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/models/CreateCardRechargeOrderRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CreateCardRechargeOrderRequestApiModel> serializer() {
            return CreateCardRechargeOrderRequestApiModel$$serializer.f5581a;
        }
    }

    public /* synthetic */ CreateCardRechargeOrderRequestApiModel(int i, String str, CardProps cardProps, PaymentProps paymentProps, String str2) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(CreateCardRechargeOrderRequestApiModel$$serializer.f5581a.getDescriptor(), i, 15);
            throw null;
        }
        this.f5580a = str;
        this.b = cardProps;
        this.c = paymentProps;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateCardRechargeOrderRequestApiModel)) {
            return false;
        }
        CreateCardRechargeOrderRequestApiModel createCardRechargeOrderRequestApiModel = (CreateCardRechargeOrderRequestApiModel) obj;
        return Intrinsics.d(this.f5580a, createCardRechargeOrderRequestApiModel.f5580a) && Intrinsics.d(this.b, createCardRechargeOrderRequestApiModel.b) && Intrinsics.d(this.c, createCardRechargeOrderRequestApiModel.c) && Intrinsics.d(this.d, createCardRechargeOrderRequestApiModel.d);
    }

    public final int hashCode() {
        int iE = nf1.e((this.b.hashCode() + (this.f5580a.hashCode() * 31)) * 31, 31, this.c.f5590a);
        String str = this.d;
        return iE + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CreateCardRechargeOrderRequestApiModel(cardNo=" + this.f5580a + ", cardProps=" + this.b + ", paymentProps=" + this.c + ", cardType=" + this.d + ")";
    }

    public CreateCardRechargeOrderRequestApiModel(String cardNo, CardProps cardProps, PaymentProps paymentProps, String str) {
        Intrinsics.i(cardNo, "cardNo");
        this.f5580a = cardNo;
        this.b = cardProps;
        this.c = paymentProps;
        this.d = str;
    }
}
