package app.chalo.tito.manager;

import app.chalo.models.validation.ValidationProduct;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.superpass.data.features.IDigitalTripReceiptFeature;
import app.chalo.tito.data.TITOValidationDataRepository;
import app.chalo.tito.data.model.TitoValidationConfigData;
import app.chalo.tito.domain.FetchTitoValidationConfigUseCase;
import app.chalo.tito.domain.GetTitoTapIdForUnifiedFlowUseCase;
import app.chalo.titoridedetail.data.app.TITOProductDetailAppModel;
import app.chalo.titoridedetail.data.app.TITOProductType;
import app.chalo.titoridedetail.data.app.TITOProductTypeKt;
import app.chalo.titoridedetail.data.app.TITOValidationAppModel;
import app.chalo.titoridedetail.data.app.TapInDetailAppModel;
import app.chalo.titoridedetail.data.app.TitoValidationStatus;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.utils.ChaloWalletOrderIdUtils;
import app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData;
import app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager;
import app.chalo.wallet.domain.GetQuickpayTransactionIdsForOrderIdUseCase;
import app.chalo.walletframework.wallet.domain.WalletSyncOrchestrator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/tito/manager/TITOUnifiedFlowValidationDataManagerImpl;", "Lapp/chalo/validationsdk/blevalidation/unifiedtito/data/TITOUnifiedFlowValidationDataManager;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TITOUnifiedFlowValidationDataManagerImpl implements TITOUnifiedFlowValidationDataManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TITOValidationDataRepository f9667a;
    public final UserProfileDetailsProvider b;
    public final FetchTitoValidationConfigUseCase c;
    public final GetQuickpayTransactionIdsForOrderIdUseCase d;
    public final IDigitalTripReceiptFeature e;
    public final WalletSyncOrchestrator f;
    public final InitiateProductHistorySyncCallUseCase g;

    public TITOUnifiedFlowValidationDataManagerImpl(TITOValidationDataRepository tITOValidationDataRepository, GetTitoTapIdForUnifiedFlowUseCase getTitoTapIdForUnifiedFlowUseCase, UserProfileDetailsProvider userProfileDetailsProvider, FetchTitoValidationConfigUseCase fetchTitoValidationConfigUseCase, GetQuickpayTransactionIdsForOrderIdUseCase getQuickpayTransactionIdsForOrderIdUseCase, IDigitalTripReceiptFeature iDigitalTripReceiptFeature, WalletSyncOrchestrator walletSyncOrchestrator, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase) {
        this.f9667a = tITOValidationDataRepository;
        this.b = userProfileDetailsProvider;
        this.c = fetchTitoValidationConfigUseCase;
        this.d = getQuickpayTransactionIdsForOrderIdUseCase;
        this.e = iDigitalTripReceiptFeature;
        this.f = walletSyncOrchestrator;
        this.g = initiateProductHistorySyncCallUseCase;
    }

    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    public final String a(BleValidationAckData.TITOTapInData tITOTapInData) {
        TITOProductType tITOProductType;
        long j = tITOTapInData.e;
        long j2 = tITOTapInData.g;
        String bookingId = tITOTapInData.b;
        TITOProductType.Companion companion = TITOProductType.INSTANCE;
        String productTypeString = tITOTapInData.c;
        companion.getClass();
        Intrinsics.i(productTypeString, "productTypeString");
        switch (productTypeString) {
            case "quickpay":
                tITOProductType = TITOProductType.QUICK_PAY;
                break;
            case "singleJourneyTicket":
                tITOProductType = TITOProductType.SINGLE_JOURNEY_TICKET;
                break;
            case "superPass":
                tITOProductType = TITOProductType.SUPER_PASS;
                break;
            case "mobileTicket":
                tITOProductType = TITOProductType.INSTANT_TICKET;
                break;
            default:
                tITOProductType = null;
                break;
        }
        if (tITOProductType == null) {
            return null;
        }
        Intrinsics.i(bookingId, "bookingId");
        return j + "_" + TITOProductTypeKt.a(tITOProductType) + "_" + bookingId + "_" + j2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b4, code lost:
    
        if (r6.f(r1, r2) == r3) goto L29;
     */
    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r18, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData.TITOTapOutData r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1
            if (r2 == 0) goto L17
            r2 = r1
            app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1 r2 = (app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.label = r3
            goto L1c
        L17:
            app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1 r2 = new app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 0
            app.chalo.tito.data.TITOValidationDataRepository r6 = r0.f9667a
            r7 = 3
            r8 = 1
            r9 = 2
            if (r4 == 0) goto L52
            if (r4 == r8) goto L45
            if (r4 == r9) goto L3d
            if (r4 != r7) goto L35
            kotlin.ResultKt.b(r1)
            goto Lb7
        L35:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3d:
            java.lang.Object r4 = r2.L$0
            app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData r4 = (app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData.TITOTapOutData) r4
            kotlin.ResultKt.b(r1)
            goto L7b
        L45:
            java.lang.Object r4 = r2.L$0
            app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData r4 = (app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData.TITOTapOutData) r4
            kotlin.ResultKt.b(r1)
            r16 = r4
            r4 = r1
            r1 = r16
            goto L64
        L52:
            kotlin.ResultKt.b(r1)
            r1 = r19
            r2.L$0 = r1
            r2.label = r8
            r4 = r18
            java.lang.Object r4 = r6.c(r4, r2)
            if (r4 != r3) goto L64
            goto Lb6
        L64:
            kotlinx.coroutines.flow.Flow r4 = (kotlinx.coroutines.flow.Flow) r4
            app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1 r8 = new app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl$updateTitoTableOnTitoTapOutDataReceived$relevantTitoEntryToUpdate$1
            r8.<init>(r9, r5)
            r2.L$0 = r1
            r2.label = r9
            java.lang.Object r4 = kotlinx.coroutines.flow.FlowKt.w(r4, r8, r2)
            if (r4 != r3) goto L76
            goto Lb6
        L76:
            r16 = r4
            r4 = r1
            r1 = r16
        L7b:
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r1 = (app.chalo.titoridedetail.data.app.TITOValidationAppModel) r1
            if (r1 == 0) goto Lba
            java.lang.String r11 = r4.h
            long r8 = r4.e
            long r12 = r4.g
            r13 = r12
            java.lang.String r12 = r4.i
            r14 = r13
            java.lang.String r13 = r4.j
            r18 = r8
            long r7 = r4.k
            r9 = r7
            app.chalo.titoridedetail.data.app.TapOutDetailAppModel r8 = new app.chalo.titoridedetail.data.app.TapOutDetailAppModel
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            java.lang.Long r7 = java.lang.Long.valueOf(r14)
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r9 = r4
            r10 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14)
            app.chalo.titoridedetail.data.app.TitoValidationStatus r4 = app.chalo.titoridedetail.data.app.TitoValidationStatus.VERIFIED_TAP_OUT_DONE
            r7 = 21
            app.chalo.titoridedetail.data.app.TITOValidationAppModel r1 = app.chalo.titoridedetail.data.app.TITOValidationAppModel.a(r1, r5, r8, r4, r7)
            r2.L$0 = r5
            r4 = 3
            r2.label = r4
            java.lang.Object r1 = r6.f(r1, r2)
            if (r1 != r3) goto Lb7
        Lb6:
            return r3
        Lb7:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        Lba:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.tito.manager.TITOUnifiedFlowValidationDataManagerImpl.b(java.lang.String, app.chalo.validationsdk.blevalidation.data.models.app.BleValidationAckData$TITOTapOutData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0089  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    public final Object c(String str, BleValidationAckData.TITOTapOutData tITOTapOutData, ContinuationImpl continuationImpl) {
        TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1 tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1;
        BleValidationAckData.TITOTapOutData tITOTapOutData2;
        TITOValidationAppModel tITOValidationAppModel;
        boolean z;
        String str2;
        String strA;
        if (continuationImpl instanceof TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1) {
            tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1 = (TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1) continuationImpl;
            int i = tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1 = new TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1(this, continuationImpl);
            }
        } else {
            tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1 = new TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1(this, continuationImpl);
        }
        Object objC = tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.label;
        if (i2 == 0) {
            ResultKt.b(objC);
            tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.L$0 = tITOTapOutData;
            tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.label = 1;
            objC = this.f9667a.c(str, tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1);
            if (objC != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            tITOTapOutData = (BleValidationAckData.TITOTapOutData) tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.L$0;
            ResultKt.b(objC);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tITOTapOutData2 = (BleValidationAckData.TITOTapOutData) tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.L$0;
            ResultKt.b(objC);
        }
        tITOValidationAppModel = (TITOValidationAppModel) objC;
        if (tITOValidationAppModel != null) {
            String str3 = tITOValidationAppModel.c.f9668a;
            str2 = tITOTapOutData2.o;
            if (str2 != null || str2.length() <= 0) {
                strA = tITOTapOutData2.b;
            } else {
                strA = ChaloWalletOrderIdUtils.a(tITOTapOutData2.p.longValue(), str2);
            }
            z = Intrinsics.d(str3, strA);
        }
        return Boolean.valueOf(z);
        TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$relevantTitoEntry$1 tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$relevantTitoEntry$1 = new TITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$relevantTitoEntry$1(2, null);
        tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.L$0 = tITOTapOutData;
        tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1.label = 2;
        objC = FlowKt.w((Flow) objC, tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$relevantTitoEntry$1, tITOUnifiedFlowValidationDataManagerImpl$doesActiveTitoTapInExistForTapOutDataReceived$1);
        if (objC != coroutineSingletons) {
            tITOTapOutData2 = tITOTapOutData;
            tITOValidationAppModel = (TITOValidationAppModel) objC;
            if (tITOValidationAppModel != null) {
                String str4 = tITOValidationAppModel.c.f9668a;
                str2 = tITOTapOutData2.o;
                if (str2 != null) {
                    strA = tITOTapOutData2.b;
                } else {
                    strA = tITOTapOutData2.b;
                }
                if (Intrinsics.d(str4, strA)) {
                }
            }
            return Boolean.valueOf(z);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    public final Object d(String str, ContinuationImpl continuationImpl) {
        TITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1 tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1;
        if (continuationImpl instanceof TITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1) {
            tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1 = (TITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1) continuationImpl;
            int i = tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1 = new TITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1(this, continuationImpl);
            }
        } else {
            tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1 = new TITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1(this, continuationImpl);
        }
        Object objA = tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1.label = 1;
            objA = this.d.a(str, tITOUnifiedFlowValidationDataManagerImpl$getQuickpayTransactionIdForTitoTapOut$1);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        for (Object obj2 : (Iterable) objA) {
            if (((String) obj2).length() > 0) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x011f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0129  */
    /* JADX WARN: Code duplicated, block: B:40:0x012c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0147  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    public final Object e(BleValidationAckData.TITOTapInData tITOTapInData, ValidationProduct validationProduct, String str, ContinuationImpl continuationImpl) {
        TITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1 tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1;
        BleValidationAckData.TITOTapInData tITOTapInData2;
        ValidationProduct validationProduct2;
        String str2;
        Object objA;
        String str3;
        String str4;
        BleValidationAckData.TITOTapInData tITOTapInData3;
        TapInDetailAppModel tapInDetailAppModel;
        TITOProductDetailAppModel tITOProductDetailAppModel;
        TitoValidationStatus titoValidationStatus;
        Object objK;
        TITOProductDetailAppModel tITOProductDetailAppModel2;
        TitoValidationStatus titoValidationStatus2;
        TapInDetailAppModel tapInDetailAppModel2;
        String str5;
        TITOValidationAppModel tITOValidationAppModel;
        ValidationProduct validationProduct3;
        if (continuationImpl instanceof TITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1) {
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1 = (TITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1) continuationImpl;
            int i = tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1 = new TITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1(this, continuationImpl);
            }
        } else {
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1 = new TITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1(this, continuationImpl);
        }
        Object obj = tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            tITOTapInData2 = tITOTapInData;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = tITOTapInData2;
            validationProduct2 = validationProduct;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = validationProduct2;
            str2 = str;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = str2;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 1;
            objA = a(tITOTapInData);
            if (objA != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str6 = (String) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2;
            ValidationProduct validationProduct4 = (ValidationProduct) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1;
            BleValidationAckData.TITOTapInData tITOTapInData4 = (BleValidationAckData.TITOTapInData) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0;
            ResultKt.b(obj);
            objA = obj;
            tITOTapInData2 = tITOTapInData4;
            str2 = str6;
            validationProduct2 = validationProduct4;
        } else {
            if (i2 == 2) {
                String str7 = (String) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3;
                String str8 = (String) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2;
                ValidationProduct validationProduct5 = (ValidationProduct) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1;
                tITOTapInData3 = (BleValidationAckData.TITOTapInData) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0;
                ResultKt.b(obj);
                str3 = str7;
                validationProduct2 = validationProduct5;
                str4 = str8;
                long j = tITOTapInData3.f;
                long j2 = ((TitoValidationConfigData) obj).c.c + (((long) 1000) * j);
                tapInDetailAppModel = new TapInDetailAppModel(str3, tITOTapInData3.e, j, str4, tITOTapInData3.g, tITOTapInData3.h, tITOTapInData3.i, tITOTapInData3.j, tITOTapInData3.k, tITOTapInData3.l, "MobKLFJu", null);
                tITOProductDetailAppModel = new TITOProductDetailAppModel(validationProduct2.getC(), validationProduct2, j2);
                titoValidationStatus = TitoValidationStatus.TAP_IN_DONE;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = validationProduct2;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = tapInDetailAppModel;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = tITOProductDetailAppModel;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = titoValidationStatus;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 3;
                objK = this.b.k(tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1);
                if (objK != coroutineSingletons) {
                    tITOProductDetailAppModel2 = tITOProductDetailAppModel;
                    titoValidationStatus2 = titoValidationStatus;
                    obj = objK;
                    tapInDetailAppModel2 = tapInDetailAppModel;
                    str5 = (String) obj;
                    if (str5 == null) {
                        return Boolean.FALSE;
                    }
                    tITOValidationAppModel = new TITOValidationAppModel(tapInDetailAppModel2, null, tITOProductDetailAppModel2, titoValidationStatus2, str5);
                    tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = validationProduct2;
                    tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = null;
                    tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = null;
                    tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = null;
                    tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 4;
                    if (this.f9667a.f(tITOValidationAppModel, tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1) != coroutineSingletons) {
                        validationProduct3 = validationProduct2;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 3) {
                TitoValidationStatus titoValidationStatus3 = (TitoValidationStatus) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3;
                TITOProductDetailAppModel tITOProductDetailAppModel3 = (TITOProductDetailAppModel) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2;
                tapInDetailAppModel = (TapInDetailAppModel) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1;
                ValidationProduct validationProduct6 = (ValidationProduct) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0;
                ResultKt.b(obj);
                titoValidationStatus2 = titoValidationStatus3;
                validationProduct2 = validationProduct6;
                tITOProductDetailAppModel2 = tITOProductDetailAppModel3;
                tapInDetailAppModel2 = tapInDetailAppModel;
                str5 = (String) obj;
                if (str5 == null) {
                    return Boolean.FALSE;
                }
                tITOValidationAppModel = new TITOValidationAppModel(tapInDetailAppModel2, null, tITOProductDetailAppModel2, titoValidationStatus2, str5);
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = validationProduct2;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 4;
                if (this.f9667a.f(tITOValidationAppModel, tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1) != coroutineSingletons) {
                    validationProduct3 = validationProduct2;
                }
                return coroutineSingletons;
            }
            if (i2 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            validationProduct3 = (ValidationProduct) tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0;
            ResultKt.b(obj);
        }
        if (!(validationProduct3 instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) || (validationProduct3 instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProduct3 instanceof ValidationProduct.QuickpayProduct.QuickpayValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) || (validationProduct3 instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
            return Boolean.TRUE;
        }
        throw new NoWhenBranchMatchedException();
        str3 = (String) objA;
        if (str3 == null) {
            return Boolean.FALSE;
        }
        tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = tITOTapInData2;
        tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = validationProduct2;
        tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = str2;
        tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = str3;
        tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 2;
        Object objA2 = this.c.a(validationProduct2, tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1);
        if (objA2 != coroutineSingletons) {
            str4 = str2;
            tITOTapInData3 = tITOTapInData2;
            obj = objA2;
            long j3 = tITOTapInData3.f;
            long j4 = ((TitoValidationConfigData) obj).c.c + (((long) 1000) * j3);
            tapInDetailAppModel = new TapInDetailAppModel(str3, tITOTapInData3.e, j3, str4, tITOTapInData3.g, tITOTapInData3.h, tITOTapInData3.i, tITOTapInData3.j, tITOTapInData3.k, tITOTapInData3.l, "MobKLFJu", null);
            tITOProductDetailAppModel = new TITOProductDetailAppModel(validationProduct2.getC(), validationProduct2, j4);
            titoValidationStatus = TitoValidationStatus.TAP_IN_DONE;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = validationProduct2;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = tapInDetailAppModel;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = tITOProductDetailAppModel;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = titoValidationStatus;
            tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 3;
            objK = this.b.k(tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1);
            if (objK != coroutineSingletons) {
                tITOProductDetailAppModel2 = tITOProductDetailAppModel;
                titoValidationStatus2 = titoValidationStatus;
                obj = objK;
                tapInDetailAppModel2 = tapInDetailAppModel;
                str5 = (String) obj;
                if (str5 == null) {
                    return Boolean.FALSE;
                }
                tITOValidationAppModel = new TITOValidationAppModel(tapInDetailAppModel2, null, tITOProductDetailAppModel2, titoValidationStatus2, str5);
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$0 = validationProduct2;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$1 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$2 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.L$3 = null;
                tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1.label = 4;
                if (this.f9667a.f(tITOValidationAppModel, tITOUnifiedFlowValidationDataManagerImpl$saveTitoTapInDataReceivedAndRevertConductorActivationIfReq$1) != coroutineSingletons) {
                    validationProduct3 = validationProduct2;
                    if (validationProduct3 instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) {
                    }
                    return Boolean.TRUE;
                }
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00a3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.validationsdk.blevalidation.unifiedtito.data.TITOUnifiedFlowValidationDataManager
    public final Object f(ValidationProduct validationProduct, ContinuationImpl continuationImpl) {
        TITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1 tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1;
        if (continuationImpl instanceof TITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1) {
            tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1 = (TITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1) continuationImpl;
            int i = tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label = i - Integer.MIN_VALUE;
            } else {
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1 = new TITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1(this, continuationImpl);
            }
        } else {
            tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1 = new TITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1(this, continuationImpl);
        }
        Object obj = tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(obj);
            this.e.a();
            tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.L$0 = validationProduct;
            tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label = 1;
            if (DelayKt.b(2500L, tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(obj);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return unit;
        }
        validationProduct = (ValidationProduct) tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.L$0;
        ResultKt.b(obj);
        if (!(validationProduct instanceof ValidationProduct.MobileTicketProduct.InstantTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.PremiumReserveTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcMetroTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.OndcTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.MetroTicketValidation) && !(validationProduct instanceof ValidationProduct.MobileTicketProduct.MultiModalGroupTicketValidation)) {
            if ((validationProduct instanceof ValidationProduct.MobileTicketProduct.SingleJourneyTicketValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.MagicPassValidation) || (validationProduct instanceof ValidationProduct.SuperPassProduct.RideBasedPassValidation)) {
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.L$0 = null;
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label = 2;
                if (InitiateProductHistorySyncCallUseCase.h(this.g, null, false, tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1, 3) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (!(validationProduct instanceof ValidationProduct.QuickpayProduct.QuickpayValidation)) {
                    throw new NoWhenBranchMatchedException();
                }
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.L$0 = null;
                tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1.label = 3;
                if (this.f.c(true, tITOUnifiedFlowValidationDataManagerImpl$syncWalletOrFetchProductHistoryAndSyncActivationDataWithBackend$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return unit;
    }
}
