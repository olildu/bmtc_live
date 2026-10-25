package app.chalo.ticketvalidation;

import defpackage.nf1;
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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lapp/chalo/ticketvalidation/TicketValidationInfoEntity;", "", "Companion", "$serializer", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
public final /* data */ class TicketValidationInfoEntity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TicketValidationType f9625a;
    public final String b;
    public final String c;
    public final QRValidationStatus d;
    public final TicketValidationMetaInfo e;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lapp/chalo/ticketvalidation/TicketValidationInfoEntity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lapp/chalo/ticketvalidation/TicketValidationInfoEntity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer<TicketValidationInfoEntity> serializer() {
            return TicketValidationInfoEntity$$serializer.f9626a;
        }
    }

    static {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        f = new Lazy[]{LazyKt.a(lazyThreadSafetyMode, new xi1(3)), null, null, LazyKt.a(lazyThreadSafetyMode, new xi1(4)), null};
    }

    public /* synthetic */ TicketValidationInfoEntity(int i, TicketValidationType ticketValidationType, String str, String str2, QRValidationStatus qRValidationStatus, TicketValidationMetaInfo ticketValidationMetaInfo) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.b(TicketValidationInfoEntity$$serializer.f9626a.getDescriptor(), i, 3);
            throw null;
        }
        this.f9625a = ticketValidationType;
        this.b = str;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = QRValidationStatus.UNKNOWN;
        } else {
            this.d = qRValidationStatus;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = ticketValidationMetaInfo;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketValidationInfoEntity)) {
            return false;
        }
        TicketValidationInfoEntity ticketValidationInfoEntity = (TicketValidationInfoEntity) obj;
        return this.f9625a == ticketValidationInfoEntity.f9625a && Intrinsics.d(this.b, ticketValidationInfoEntity.b) && Intrinsics.d(this.c, ticketValidationInfoEntity.c) && this.d == ticketValidationInfoEntity.d && Intrinsics.d(this.e, ticketValidationInfoEntity.e);
    }

    public final int hashCode() {
        int iE = nf1.e(this.f9625a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (this.d.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        TicketValidationMetaInfo ticketValidationMetaInfo = this.e;
        return iHashCode + (ticketValidationMetaInfo != null ? ticketValidationMetaInfo.hashCode() : 0);
    }

    public final String toString() {
        return "TicketValidationInfoEntity(type=" + this.f9625a + ", code=" + this.b + ", ticketNumber=" + this.c + ", validationStatus=" + this.d + ", metaInfo=" + this.e + ")";
    }

    public TicketValidationInfoEntity(QRValidationStatus validationStatus, TicketValidationMetaInfo ticketValidationMetaInfo, TicketValidationType type, String code, String str) {
        Intrinsics.i(type, "type");
        Intrinsics.i(code, "code");
        Intrinsics.i(validationStatus, "validationStatus");
        this.f9625a = type;
        this.b = code;
        this.c = str;
        this.d = validationStatus;
        this.e = ticketValidationMetaInfo;
    }
}
