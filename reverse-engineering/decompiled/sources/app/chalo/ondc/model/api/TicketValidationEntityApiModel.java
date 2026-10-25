package app.chalo.ondc.model.api;

import defpackage.cb0;
import defpackage.dd;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.PluginExceptionsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ondc/model/api/TicketValidationEntityApiModel;", "", "Companion", "$serializer", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketValidationEntityApiModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6732a;
    public final String b;
    public final String c;
    public final String d;
    public final TicketValidationMetaInfoApiModel e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ondc/model/api/TicketValidationEntityApiModel$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ondc/model/api/TicketValidationEntityApiModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productbooking_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketValidationEntityApiModel> serializer() {
            return TicketValidationEntityApiModel$$serializer.f6733a;
        }
    }

    public /* synthetic */ TicketValidationEntityApiModel(int i, String str, String str2, String str3, String str4, TicketValidationMetaInfoApiModel ticketValidationMetaInfoApiModel) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.b(TicketValidationEntityApiModel$$serializer.f6733a.getDescriptor(), i, 7);
            throw null;
        }
        this.f6732a = str;
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
            this.e = ticketValidationMetaInfoApiModel;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketValidationEntityApiModel)) {
            return false;
        }
        TicketValidationEntityApiModel ticketValidationEntityApiModel = (TicketValidationEntityApiModel) obj;
        return Intrinsics.d(this.f6732a, ticketValidationEntityApiModel.f6732a) && Intrinsics.d(this.b, ticketValidationEntityApiModel.b) && Intrinsics.d(this.c, ticketValidationEntityApiModel.c) && Intrinsics.d(this.d, ticketValidationEntityApiModel.d) && Intrinsics.d(this.e, ticketValidationEntityApiModel.e);
    }

    public final int hashCode() {
        int iHashCode = this.f6732a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TicketValidationMetaInfoApiModel ticketValidationMetaInfoApiModel = this.e;
        return iHashCode4 + (ticketValidationMetaInfoApiModel != null ? ticketValidationMetaInfoApiModel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbE = dd.e("TicketValidationEntityApiModel(type=", this.f6732a, ", code=", this.b, ", ticketNumber=");
        cb0.t(sbE, this.c, ", validationStatus=", this.d, ", metaInfo=");
        sbE.append(this.e);
        sbE.append(")");
        return sbE.toString();
    }
}
