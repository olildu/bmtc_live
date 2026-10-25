package app.chalo.productpurchase.passpurchase.utils;

import app.chalo.contract.BasicInfoContract;
import app.chalo.fileupload.picker.BitmapImage;
import app.chalo.models.BookableSuperPassConfiguration;
import app.chalo.productpurchase.passpurchase.data.ProofUploadDetails;
import app.chalo.productpurchase.passpurchase.data.ProofUploadStatus;
import app.chalo.superpass.data.models.entities.SuperPassProofProperties;
import app.chalo.superpass.data.models.entities.SuperPassUserDetails;
import app.chalo.superpass.data.repository.SuperPassRepository;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/utils/SmartSuperPassPassengerSelectionHelper;", "", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SmartSuperPassPassengerSelectionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SuperPassRepository f8521a;
    public final BasicInfoContract b;

    public SmartSuperPassPassengerSelectionHelper(SuperPassRepository superPassRepository, BasicInfoContract basicInfoContract) {
        this.f8521a = superPassRepository;
        this.b = basicInfoContract;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r8 == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(app.chalo.models.BookableSuperPassConfiguration r6, app.chalo.superpass.data.models.entities.SuperPassUserDetails r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$findBookedSuperPassForRenewIfAvailable$1
            if (r0 == 0) goto L13
            r0 = r8
            app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$findBookedSuperPassForRenewIfAvailable$1 r0 = (app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$findBookedSuperPassForRenewIfAvailable$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$findBookedSuperPassForRenewIfAvailable$1 r0 = new app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$findBookedSuperPassForRenewIfAvailable$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r6 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPass r6 = (app.chalo.superpass.data.models.entities.SuperPass) r6
            kotlin.ResultKt.b(r8)
            goto L56
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            kotlin.ResultKt.b(r8)
            goto L48
        L3a:
            kotlin.ResultKt.b(r8)
            r0.label = r4
            app.chalo.superpass.data.repository.SuperPassRepository r8 = r5.f8521a
            java.lang.Object r8 = r8.c(r6, r7, r0)
            if (r8 != r1) goto L48
            goto L55
        L48:
            r6 = r8
            app.chalo.superpass.data.models.entities.SuperPass r6 = (app.chalo.superpass.data.models.entities.SuperPass) r6
            r0.L$0 = r6
            r0.label = r3
            java.lang.Object r8 = r5.c(r6, r0)
            if (r8 != r1) goto L56
        L55:
            return r1
        L56:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 == 0) goto L5f
            return r6
        L5f:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper.a(app.chalo.models.BookableSuperPassConfiguration, app.chalo.superpass.data.models.entities.SuperPassUserDetails, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(BookableSuperPassConfiguration bookableSuperPassConfiguration, long j, SuperPassUserDetails superPassUserDetails, ContinuationImpl continuationImpl) {
        SmartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1 smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1;
        if (continuationImpl instanceof SmartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1) {
            smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1 = (SmartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1) continuationImpl;
            int i = smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1.label = i - Integer.MIN_VALUE;
            } else {
                smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1 = new SmartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1(this, continuationImpl);
            }
        } else {
            smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1 = new SmartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1(this, continuationImpl);
        }
        Object objJ = smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1.label;
        if (i2 == 0) {
            ResultKt.b(objJ);
            long j2 = j + bookableSuperPassConfiguration.c.f;
            smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1.label = 1;
            objJ = this.f8521a.j(superPassUserDetails, j2, smartSuperPassPassengerSelectionHelper$getValidUploadedProofsForUserForSelectedProduct$1);
            if (objJ == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objJ);
        }
        HashMap map = new HashMap();
        for (Map.Entry entry : ((Map) objJ).entrySet()) {
            map.put((String) entry.getKey(), new ProofUploadDetails(((SuperPassProofProperties) entry.getValue()).b, (BitmapImage) null, "", ProofUploadStatus.UPLOAD_SUCCESSFUL, true));
        }
        return map;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        if (r10 == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(app.chalo.superpass.data.models.entities.SuperPass r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$isActuallyRenewFlow$1
            if (r0 == 0) goto L13
            r0 = r10
            app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$isActuallyRenewFlow$1 r0 = (app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$isActuallyRenewFlow$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$isActuallyRenewFlow$1 r0 = new app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper$isActuallyRenewFlow$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            kotlin.ResultKt.b(r10)
            goto L60
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            java.lang.Object r9 = r0.L$0
            app.chalo.superpass.data.models.entities.SuperPass r9 = (app.chalo.superpass.data.models.entities.SuperPass) r9
            kotlin.ResultKt.b(r10)
            goto L4e
        L3b:
            kotlin.ResultKt.b(r10)
            if (r9 != 0) goto L41
            goto L69
        L41:
            r0.L$0 = r9
            r0.label = r5
            app.chalo.contract.BasicInfoContract r10 = r8.b
            java.lang.Object r10 = r10.c(r0)
            if (r10 != r1) goto L4e
            goto L5f
        L4e:
            java.lang.Number r10 = (java.lang.Number) r10
            long r6 = r10.longValue()
            r10 = 0
            r0.L$0 = r10
            r0.label = r4
            java.lang.Object r10 = r9.c(r6, r0)
            if (r10 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L69
            r3 = r5
        L69:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.utils.SmartSuperPassPassengerSelectionHelper.c(app.chalo.superpass.data.models.entities.SuperPass, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
