package app.chalo.ondc.domain;

import app.chalo.ondc.model.api.TicketValidationEntityApiModel;
import app.chalo.ondc.model.api.TicketValidationMetaInfoApiModel;
import app.chalo.ticketvalidation.QRValidationStatus;
import app.chalo.ticketvalidation.TicketQrSchemaType;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.ticketvalidation.TicketValidationMetaInfo;
import app.chalo.ticketvalidation.TicketValidationType;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"productbooking_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class GetOndcMetroTicketAppModelFromApiUseCaseKt {

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6717a;

        static {
            int[] iArr = new int[TicketQrSchemaType.values().length];
            try {
                iArr[TicketQrSchemaType.REGULAR_STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TicketQrSchemaType.DYNAMIC_BMRCL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6717a = iArr;
        }
    }

    public static final TicketValidationInfo a(TicketValidationEntityApiModel ticketValidationEntityApiModel) {
        TicketValidationType ticketValidationType;
        QRValidationStatus next;
        TicketValidationMetaInfo ticketValidationMetaInfo;
        TicketQrSchemaType next2;
        Intrinsics.i(ticketValidationEntityApiModel, "<this>");
        try {
            TicketValidationType.Companion companion = TicketValidationType.INSTANCE;
            String type = ticketValidationEntityApiModel.f6732a;
            companion.getClass();
            Intrinsics.i(type, "type");
            TicketValidationType[] ticketValidationTypeArrValues = TicketValidationType.values();
            int length = ticketValidationTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    ticketValidationType = null;
                    break;
                }
                ticketValidationType = ticketValidationTypeArrValues[i];
                if (Intrinsics.d(ticketValidationType.getType(), type)) {
                    break;
                }
                i++;
            }
            if (ticketValidationType == null) {
                ticketValidationType = TicketValidationType.QR_CODE;
            }
            TicketValidationType ticketValidationType2 = ticketValidationType;
            String str = ticketValidationEntityApiModel.b;
            if (str == null) {
                return null;
            }
            String str2 = ticketValidationEntityApiModel.c;
            QRValidationStatus.Companion companion2 = QRValidationStatus.INSTANCE;
            String str3 = ticketValidationEntityApiModel.d;
            companion2.getClass();
            Iterator<QRValidationStatus> it = QRValidationStatus.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!StringsKt.x(next.name(), str3, true));
            QRValidationStatus qRValidationStatus = next;
            if (qRValidationStatus == null) {
                qRValidationStatus = QRValidationStatus.UNKNOWN;
            }
            QRValidationStatus qRValidationStatus2 = qRValidationStatus;
            TicketValidationMetaInfoApiModel ticketValidationMetaInfoApiModel = ticketValidationEntityApiModel.e;
            if (ticketValidationMetaInfoApiModel != null) {
                long j = ticketValidationMetaInfoApiModel.c;
                String str4 = ticketValidationMetaInfoApiModel.b;
                TicketQrSchemaType.Companion companion3 = TicketQrSchemaType.INSTANCE;
                String str5 = ticketValidationMetaInfoApiModel.f6734a;
                companion3.getClass();
                Iterator<TicketQrSchemaType> it2 = TicketQrSchemaType.getEntries().iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!StringsKt.x(next2.getValue(), str5, true));
                TicketQrSchemaType ticketQrSchemaType = next2;
                if (ticketQrSchemaType == null) {
                    ticketQrSchemaType = TicketQrSchemaType.REGULAR_STATIC;
                }
                int i2 = WhenMappings.f6717a[ticketQrSchemaType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (str4 == null) {
                        str4 = "";
                    }
                    if (j == null) {
                        j = 20L;
                    }
                }
                ticketValidationMetaInfo = new TicketValidationMetaInfo(ticketQrSchemaType, str4, j);
            } else {
                ticketValidationMetaInfo = null;
            }
            return new TicketValidationInfo(qRValidationStatus2, ticketValidationMetaInfo, ticketValidationType2, str, str2);
        } catch (Exception unused) {
        }
    }
}
