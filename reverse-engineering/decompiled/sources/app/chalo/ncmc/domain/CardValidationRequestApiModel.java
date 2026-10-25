package app.chalo.ncmc.domain;

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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/domain/CardValidationRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class CardValidationRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6217a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/domain/CardValidationRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/domain/CardValidationRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<CardValidationRequestApiModel> serializer() {
            return CardValidationRequestApiModel$$serializer.f6218a;
        }
    }

    public /* synthetic */ CardValidationRequestApiModel(int i, int i2, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.b(CardValidationRequestApiModel$$serializer.f6218a.getDescriptor(), i, 31);
            throw null;
        }
        this.f6217a = str;
        this.b = str2;
        this.c = str3;
        this.d = i2;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CardValidationRequestApiModel)) {
            return false;
        }
        CardValidationRequestApiModel cardValidationRequestApiModel = (CardValidationRequestApiModel) obj;
        return Intrinsics.d(this.f6217a, cardValidationRequestApiModel.f6217a) && Intrinsics.d(this.b, cardValidationRequestApiModel.b) && Intrinsics.d(this.c, cardValidationRequestApiModel.c) && this.d == cardValidationRequestApiModel.d && Intrinsics.d(this.e, cardValidationRequestApiModel.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((nf1.e(nf1.e(this.f6217a.hashCode() * 31, 31, this.b), 31, this.c) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("CardValidationRequestApiModel(city=", this.f6217a, ", cardNo=", this.b, ", agency=");
        cb0.o(this.d, this.c, ", appVer=", ", deviceId=", sbE);
        return vo1.p(sbE, this.e, ")");
    }

    public CardValidationRequestApiModel(String city, String cardNo, String agency, int i) {
        Intrinsics.i(city, "city");
        Intrinsics.i(cardNo, "cardNo");
        Intrinsics.i(agency, "agency");
        this.f6217a = city;
        this.b = cardNo;
        this.c = agency;
        this.d = i;
        this.e = "123456";
    }
}
