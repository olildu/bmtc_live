package app.chalo.ondc.validation.metro;

import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.ticketvalidation.QRValidationStatus;
import app.chalo.ticketvalidation.TicketValidationInfo;
import app.chalo.ticketvalidation.TicketValidationInfoKt;
import app.chalo.validationsdk.blevalidation.config.ProductValidationCommonUIManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/ondc/validation/metro/OndcMetroTicketProductValidationUIManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationUIManager;", "Lapp/chalo/validationsdk/blevalidation/config/ProductValidationCommonUIManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OndcMetroTicketProductValidationUIManager implements ProductValidationUIManager, ProductValidationCommonUIManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductValidationCommonUIManager f6809a;
    public final StringProvider b;

    public OndcMetroTicketProductValidationUIManager(ProductValidationCommonUIManager productValidationCommonUIManager, StringProvider stringProvider) {
        this.f6809a = productValidationCommonUIManager;
        this.b = stringProvider;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum a() {
        return StringEnum.VIEW_RECEIPT_BOTTOMSHEET_COPY_TICKET;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final Object b(ProductValidationData productValidationData, Continuation continuation) {
        return k(productValidationData, (ContinuationImpl) continuation);
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean c() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean d() {
        return true;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean e() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean f() {
        return false;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum g() {
        return StringEnum.ACTIVATION_EXPIRED_MTICKET_TITLE;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final StringEnum h() {
        return StringEnum.ACTIVATION_EXPIRED_MTICKET_COPY;
    }

    @Override // app.chalo.validationsdk.blevalidation.config.ProductValidationUIManager
    public final boolean i() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(ProductValidationData productValidationData, QRValidationStatus qRValidationStatus, ContinuationImpl continuationImpl) {
        OndcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1 ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1;
        TicketValidationInfo ticketValidationInfo;
        if (continuationImpl instanceof OndcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1) {
            ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1 = (OndcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1) continuationImpl;
            int i = ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.label = i - Integer.MIN_VALUE;
            } else {
                ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1 = new OndcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1(this, continuationImpl);
            }
        } else {
            ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1 = new OndcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1(this, continuationImpl);
        }
        Object objQ = ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.label;
        if (i2 == 0) {
            ResultKt.b(objQ);
            ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.L$0 = qRValidationStatus;
            ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.label = 1;
            objQ = productValidationData.q(ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1);
            if (objQ == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qRValidationStatus = (QRValidationStatus) ondcMetroTicketProductValidationUIManager$checkIfQRStatusMatches$1.L$0;
            ResultKt.b(objQ);
        }
        ArrayList arrayListA = TicketValidationInfoKt.a((List) objQ);
        QRValidationStatus qRValidationStatus2 = null;
        if (arrayListA.isEmpty()) {
            arrayListA = null;
        }
        if (arrayListA != null && (ticketValidationInfo = (TicketValidationInfo) CollectionsKt.H(arrayListA)) != null) {
            qRValidationStatus2 = ticketValidationInfo.e;
        }
        return Boolean.valueOf(qRValidationStatus2 == qRValidationStatus);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r14 == r1) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r14 == r1) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager$validationStatus$1
            if (r0 == 0) goto L13
            r0 = r14
            app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager$validationStatus$1 r0 = (app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager$validationStatus$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager$validationStatus$1 r0 = new app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager$validationStatus$1
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            app.chalo.uistate.base.ChaloColorToken$GreenBase r3 = app.chalo.uistate.base.ChaloColorToken.GreenBase.f9800a
            app.chalo.uistate.base.ChaloColorToken$AmountAddedText r4 = app.chalo.uistate.base.ChaloColorToken.AmountAddedText.f9758a
            r5 = 0
            app.chalo.providers.stringprovider.StringProvider r6 = r12.b
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r2 == 0) goto L59
            if (r2 == r10) goto L51
            if (r2 == r9) goto L49
            if (r2 == r8) goto L45
            if (r2 != r7) goto L3d
            java.lang.Object r13 = r0.L$0
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState$Companion r13 = (app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.Companion) r13
            kotlin.ResultKt.b(r14)
            goto Lb2
        L3d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L45:
            kotlin.ResultKt.b(r14)
            goto L99
        L49:
            java.lang.Object r13 = r0.L$0
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState$Companion r13 = (app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.Companion) r13
            kotlin.ResultKt.b(r14)
            goto L82
        L51:
            java.lang.Object r13 = r0.L$0
            app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r13 = (app.chalo.validationsdk.blevalidation.data.models.ProductValidationData) r13
            kotlin.ResultKt.b(r14)
            goto L69
        L59:
            kotlin.ResultKt.b(r14)
            app.chalo.ticketvalidation.QRValidationStatus r14 = app.chalo.ticketvalidation.QRValidationStatus.TAPPED_OUT
            r0.L$0 = r13
            r0.label = r10
            java.lang.Object r14 = r12.j(r13, r14, r0)
            if (r14 != r1) goto L69
            goto Lb1
        L69:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L8c
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState$Companion r13 = app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.d
            app.chalo.providers.stringprovider.StringEnum r14 = app.chalo.providers.stringprovider.StringEnum.TAPPED_OUT
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0.L$0 = r13
            r0.label = r9
            java.lang.Object r14 = r6.b(r14, r2, r0)
            if (r14 != r1) goto L82
            goto Lb1
        L82:
            java.lang.String r14 = (java.lang.String) r14
            r13.getClass()
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState r13 = app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.Companion.a(r14, r11, r4, r3)
            return r13
        L8c:
            app.chalo.ticketvalidation.QRValidationStatus r14 = app.chalo.ticketvalidation.QRValidationStatus.TAPPED_IN
            r0.L$0 = r11
            r0.label = r8
            java.lang.Object r14 = r12.j(r13, r14, r0)
            if (r14 != r1) goto L99
            goto Lb1
        L99:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r13 = r14.booleanValue()
            if (r13 == 0) goto Lbc
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState$Companion r13 = app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.d
            app.chalo.providers.stringprovider.StringEnum r14 = app.chalo.providers.stringprovider.StringEnum.TAPPED_IN
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0.L$0 = r13
            r0.label = r7
            java.lang.Object r14 = r6.b(r14, r2, r0)
            if (r14 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            java.lang.String r14 = (java.lang.String) r14
            r13.getClass()
            app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState r13 = app.chalo.validationsdk.multiproductvalidation.ui.ValidationTicketStatusUIState.Companion.a(r14, r11, r4, r3)
            return r13
        Lbc:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.ondc.validation.metro.OndcMetroTicketProductValidationUIManager.k(app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
