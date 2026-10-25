package app.chalo.ticketvalidation;

import defpackage.pk0;
import defpackage.xi1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lapp/chalo/ticketvalidation/TicketValidationMetaInfo;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketValidationMetaInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {LazyKt.a(LazyThreadSafetyMode.PUBLICATION, new xi1(5)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketQrSchemaType f9627a;
    public final String b;
    public final Long c;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lapp/chalo/ticketvalidation/TicketValidationMetaInfo$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ticketvalidation/TicketValidationMetaInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_STATUS", "Ljava/lang/String;", "", "DEFAULT_REFRESH_TIME", "J", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketValidationMetaInfo> serializer() {
            return TicketValidationMetaInfo$$serializer.f9628a;
        }
    }

    public /* synthetic */ TicketValidationMetaInfo(int i, TicketQrSchemaType ticketQrSchemaType, String str, Long l) {
        if (6 != (i & 6)) {
            PluginExceptionsKt.b(TicketValidationMetaInfo$$serializer.f9628a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f9627a = TicketQrSchemaType.REGULAR_STATIC;
        } else {
            this.f9627a = ticketQrSchemaType;
        }
        this.b = str;
        this.c = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketValidationMetaInfo)) {
            return false;
        }
        TicketValidationMetaInfo ticketValidationMetaInfo = (TicketValidationMetaInfo) obj;
        return this.f9627a == ticketValidationMetaInfo.f9627a && Intrinsics.d(this.b, ticketValidationMetaInfo.b) && Intrinsics.d(this.c, ticketValidationMetaInfo.c);
    }

    public final int hashCode() {
        int iHashCode = this.f9627a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.c;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TicketValidationMetaInfo(qrSchemaType=");
        sb.append(this.f9627a);
        sb.append(", qrSchemaStatus=");
        sb.append(this.b);
        sb.append(", qrRefreshTime=");
        return pk0.l(sb, this.c, ")");
    }

    public TicketValidationMetaInfo(TicketQrSchemaType ticketQrSchemaType, String str, Long l) {
        this.f9627a = ticketQrSchemaType;
        this.b = str;
        this.c = l;
    }
}
