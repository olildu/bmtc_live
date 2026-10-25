package app.chalo.tito.domain;

import app.chalo.contract.BasicInfoContract;
import app.chalo.instantticket.data.InstantTicketRepository;
import app.chalo.instantticket.data.model.InstantTicketStatus;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.walletframework.quickpay.data.model.QuickPayOrderStatus;
import app.chalo.walletframework.quickpay.data.repository.QuickPayRepository;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/domain/GroupAsActiveExpiredAndUnknownFromProductsListUseCase;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GroupAsActiveExpiredAndUnknownFromProductsListUseCase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GetSuperPassForSuperPassIdUseCase f9664a;
    public final QuickPayRepository b;
    public final InstantTicketRepository c;
    public final BasicInfoContract d;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9665a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[QuickPayOrderStatus.values().length];
            try {
                iArr[QuickPayOrderStatus.PENDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QuickPayOrderStatus.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QuickPayOrderStatus.REFUNDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f9665a = iArr;
            int[] iArr2 = new int[InstantTicketStatus.values().length];
            try {
                iArr2[InstantTicketStatus.ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InstantTicketStatus.PAYMENT_PROCESSING.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InstantTicketStatus.FAILED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InstantTicketStatus.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InstantTicketStatus.PAYMENT_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InstantTicketStatus.EXPIRED.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            b = iArr2;
            int[] iArr3 = new int[TITOProductType.values().length];
            try {
                iArr3[TITOProductType.SUPER_PASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[TITOProductType.SINGLE_JOURNEY_TICKET.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[TITOProductType.QUICK_PAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[TITOProductType.INSTANT_TICKET.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            c = iArr3;
        }
    }

    public GroupAsActiveExpiredAndUnknownFromProductsListUseCase(GetSuperPassForSuperPassIdUseCase getSuperPassForSuperPassIdUseCase, QuickPayRepository quickPayRepository, InstantTicketRepository instantTicketRepository, BasicInfoContract basicInfoContract) {
        this.f9664a = getSuperPassForSuperPassIdUseCase;
        this.b = quickPayRepository;
        this.c = instantTicketRepository;
        this.d = basicInfoContract;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:106:0x0301  */
    /* JADX WARN: Code duplicated, block: B:22:0x0115  */
    /* JADX WARN: Code duplicated, block: B:34:0x015e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:89:0x027e  */
    /* JADX WARN: Code duplicated, block: B:92:0x02ad A[PHI: r1 r4 r9 r10 r11 r12
      0x02ad: PHI (r1v7 java.lang.Object) = (r1v1 java.lang.Object), (r1v46 java.lang.Object) binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r4v20 app.chalo.titoridedetail.data.app.TITOProductDetailAppModel) = 
      (r4v3 app.chalo.titoridedetail.data.app.TITOProductDetailAppModel)
      (r4v28 app.chalo.titoridedetail.data.app.TITOProductDetailAppModel)
     binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r9v17 java.util.Iterator) = (r9v3 java.util.Iterator), (r9v25 java.util.Iterator) binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r10v18 java.util.List) = (r10v3 java.util.List), (r10v26 java.util.List) binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r11v17 java.util.List) = (r11v3 java.util.List), (r11v21 java.util.List) binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]
      0x02ad: PHI (r12v19 java.util.List) = (r12v2 java.util.List), (r12v27 java.util.List) binds: [B:18:0x00df, B:90:0x02aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02c6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x0301 -> B:20:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0173 -> B:63:0x01ea). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x019e -> B:64:0x01ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01c8 -> B:56:0x01cc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x01de -> B:64:0x01ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x01e2 -> B:64:0x01ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01e6 -> B:64:0x01ed). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0270 -> B:71:0x0221). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:87:0x0274 -> B:71:0x0221). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:88:0x0278 -> B:63:0x01ea). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(java.util.ArrayList r20, kotlin.coroutines.jvm.internal.ContinuationImpl r21) {
        /*
            Method dump skipped, instruction units count: 856
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.domain.GroupAsActiveExpiredAndUnknownFromProductsListUseCase.a(java.util.ArrayList, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
