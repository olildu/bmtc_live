package app.chalo.ncmc.data.apirequestmodel;

import defpackage.dd;
import defpackage.nf1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ncmc/data/apirequestmodel/LinkChaloCardRequestApiModel;", "", "Companion", "$serializer", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class LinkChaloCardRequestApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6063a;
    public final String b;
    public final String c;
    public final boolean d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ncmc/data/apirequestmodel/LinkChaloCardRequestApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ncmc/data/apirequestmodel/LinkChaloCardRequestApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<LinkChaloCardRequestApiModel> serializer() {
            return LinkChaloCardRequestApiModel$$serializer.f6064a;
        }
    }

    public /* synthetic */ LinkChaloCardRequestApiModel(String str, String str2, int i, String str3, boolean z) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.b(LinkChaloCardRequestApiModel$$serializer.f6064a.getDescriptor(), i, 15);
            throw null;
        }
        this.f6063a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkChaloCardRequestApiModel)) {
            return false;
        }
        LinkChaloCardRequestApiModel linkChaloCardRequestApiModel = (LinkChaloCardRequestApiModel) obj;
        return Intrinsics.d(this.f6063a, linkChaloCardRequestApiModel.f6063a) && Intrinsics.d(this.b, linkChaloCardRequestApiModel.b) && Intrinsics.d(this.c, linkChaloCardRequestApiModel.c) && this.d == linkChaloCardRequestApiModel.d;
    }

    public final int hashCode() {
        int iHashCode = this.f6063a.hashCode() * 31;
        String str = this.b;
        return nf1.e((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("LinkChaloCardRequestApiModel(cardNumber=", this.f6063a, ", cardLinkCode=", this.b, ", city=");
        sbE.append(this.c);
        sbE.append(", isAutoLinkFlow=");
        sbE.append(this.d);
        sbE.append(")");
        return sbE.toString();
    }

    public LinkChaloCardRequestApiModel(String cardNumber, String str, String city, boolean z) {
        Intrinsics.i(cardNumber, "cardNumber");
        Intrinsics.i(city, "city");
        this.f6063a = cardNumber;
        this.b = str;
        this.c = city;
        this.d = z;
    }
}
