package app.chalo.productpurchase.passpurchase.ui.verificationstatus;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.domain.DoesUserHaveProductsOnMultipleDeviceUseCase;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.productpurchase.passpurchase.domain.GetPassVerificationTimingDetailsUseCase;
import app.chalo.productpurchase.passpurchase.domain.MPassVerificationTimingDetails;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.HomeArgs;
import app.chalo.scenes.args.SuperPassVerificationStatusArgs;
import app.chalo.superpass.data.models.entities.SuperPassApplication;
import app.chalo.utils.timeutil.TimeUtilsContract;
import com.arkivanov.decompose.ComponentContext;
import defpackage.gf;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusIntent;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusDataState;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationUIState;", "Lapp/chalo/productpurchase/passpurchase/ui/verificationstatus/SuperPassVerificationStatusEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SuperPassVerificationStatusComponent extends ChaloBaseStateMviComponent<SuperPassVerificationStatusIntent, SuperPassVerificationStatusDataState, SuperPassVerificationUIState, SuperPassVerificationStatusEffect> {
    public final ComponentContext k;
    public final GetPassVerificationTimingDetailsUseCase l;
    public final TimeUtilsContract m;
    public final AnalyticsContract n;
    public final ChaloNavigationManager o;
    public final StringProvider p;
    public final CityProvider q;
    public final UserProfileDetailsProvider r;
    public final IReportProblemFeature s;
    public final DoesUserHaveProductsOnMultipleDeviceUseCase t;

    public SuperPassVerificationStatusComponent(SuperPassVerificationStatusArgs superPassVerificationStatusArgs, ComponentContext componentContext, GetPassVerificationTimingDetailsUseCase getPassVerificationTimingDetailsUseCase, TimeUtilsContract timeUtilsContract, AnalyticsContract analyticsContract, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, CityProvider cityProvider, UserProfileDetailsProvider userProfileDetailsProvider, IReportProblemFeature iReportProblemFeature, DoesUserHaveProductsOnMultipleDeviceUseCase doesUserHaveProductsOnMultipleDeviceUseCase) {
        super(componentContext);
        this.k = componentContext;
        this.l = getPassVerificationTimingDetailsUseCase;
        this.m = timeUtilsContract;
        this.n = analyticsContract;
        this.o = chaloNavigationManager;
        this.p = stringProvider;
        this.q = cityProvider;
        this.r = userProfileDetailsProvider;
        this.s = iReportProblemFeature;
        this.t = doesUserHaveProductsOnMultipleDeviceUseCase;
        I0(new SuperPassVerificationStatusIntent.InitializationIntent(superPassVerificationStatusArgs));
    }

    public static void J0(SuperPassVerificationStatusComponent superPassVerificationStatusComponent, String str, SuperPassApplication superPassApplication, String str2, int i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if ((i & 4) != 0) {
            superPassApplication = ((SuperPassVerificationStatusDataState) superPassVerificationStatusComponent.f.getValue()).f8515a;
        }
        if ((i & 8) != 0) {
            str2 = ((SuperPassVerificationStatusDataState) superPassVerificationStatusComponent.f.getValue()).c;
        }
        String str3 = str2;
        if (superPassApplication != null) {
            superPassVerificationStatusComponent.getClass();
            linkedHashMap.put("passengerType", superPassApplication.d);
            linkedHashMap.put("fareMappingId", Integer.valueOf(superPassApplication.e));
            linkedHashMap.put("productId", superPassApplication.c);
            linkedHashMap.put("productName", superPassApplication.g);
            linkedHashMap.put("startDate", superPassVerificationStatusComponent.m.Q(superPassApplication.h));
            linkedHashMap.put("isSuperPass", Boolean.TRUE);
        }
        AnalyticsContract.DefaultImpls.a(superPassVerificationStatusComponent.n, str, str3, linkedHashMap, null, false, 24);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x023d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0240  */
    /* JADX WARN: Code duplicated, block: B:43:0x025f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0267  */
    /* JADX WARN: Code duplicated, block: B:47:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:49:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:56:0x0346  */
    /* JADX WARN: Code duplicated, block: B:60:0x0314 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d7, code lost:
    
        if (r1 == r3) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: F0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusDataState r39, kotlin.coroutines.jvm.internal.ContinuationImpl r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 877
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusComponent.p0(app.chalo.productpurchase.passpurchase.ui.verificationstatus.SuperPassVerificationStatusDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void G0() {
        J0(this, "superPass verification status back btn clicked", null, null, 14);
        boolean zD = Intrinsics.d(((SuperPassVerificationStatusDataState) this.f.getValue()).c, "sourceSuperPassPurchaseFragment");
        ChaloNavigationManager chaloNavigationManager = this.o;
        if (zD) {
            chaloNavigationManager.b(new ChaloNavigationRequest.Navigate(new HomeArgs((String) null, (String) null, 7), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
        } else {
            gf.u(null, chaloNavigationManager);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:37:0x011d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0135  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        SuperPassVerificationStatusComponent$nextSteps$1 superPassVerificationStatusComponent$nextSteps$1;
        Pair[] pairArr;
        Pair[] pairArr2;
        int i;
        Object objB;
        Object obj;
        Pair[] pairArr3;
        Pair[] pairArr4;
        Object objB2;
        Object obj2;
        int i2;
        Pair[] pairArr5;
        Pair[] pairArr6;
        Object objB3;
        Object obj3;
        Pair[] pairArr7;
        Pair[] pairArr8;
        int i3;
        if (continuationImpl instanceof SuperPassVerificationStatusComponent$nextSteps$1) {
            superPassVerificationStatusComponent$nextSteps$1 = (SuperPassVerificationStatusComponent$nextSteps$1) continuationImpl;
            int i4 = superPassVerificationStatusComponent$nextSteps$1.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                superPassVerificationStatusComponent$nextSteps$1.label = i4 - Integer.MIN_VALUE;
            } else {
                superPassVerificationStatusComponent$nextSteps$1 = new SuperPassVerificationStatusComponent$nextSteps$1(this, continuationImpl);
            }
        } else {
            superPassVerificationStatusComponent$nextSteps$1 = new SuperPassVerificationStatusComponent$nextSteps$1(this, continuationImpl);
        }
        Object objB4 = superPassVerificationStatusComponent$nextSteps$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = superPassVerificationStatusComponent$nextSteps$1.label;
        int i6 = 2;
        int i7 = 1;
        StringProvider stringProvider = this.p;
        switch (i5) {
            case 0:
                ResultKt.b(objB4);
                Pair[] pairArr9 = new Pair[3];
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr9;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr9;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = 0;
                superPassVerificationStatusComponent$nextSteps$1.label = 1;
                Object objB5 = stringProvider.b(StringEnum.SMS_NOTIFICATION, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB5 != coroutineSingletons) {
                    pairArr = pairArr9;
                    pairArr2 = pairArr;
                    objB4 = objB5;
                    i = 0;
                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr2;
                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr;
                    superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                    superPassVerificationStatusComponent$nextSteps$1.I$0 = i;
                    superPassVerificationStatusComponent$nextSteps$1.label = 2;
                    objB = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_ONE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                    if (objB != coroutineSingletons) {
                        obj = objB4;
                        objB4 = objB;
                        pairArr[i] = new Pair(obj, objB4);
                        superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr2;
                        superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr2;
                        superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                        superPassVerificationStatusComponent$nextSteps$1.I$0 = 1;
                        superPassVerificationStatusComponent$nextSteps$1.label = 3;
                        objB4 = stringProvider.b(StringEnum.PAYMENT_FOR_PASS, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                        if (objB4 != coroutineSingletons) {
                            pairArr3 = pairArr2;
                            pairArr4 = pairArr3;
                            superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                            superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr3;
                            superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                            superPassVerificationStatusComponent$nextSteps$1.I$0 = i7;
                            superPassVerificationStatusComponent$nextSteps$1.label = 4;
                            objB2 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_TWO, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                            if (objB2 != coroutineSingletons) {
                                int i8 = i7;
                                obj2 = objB4;
                                objB4 = objB2;
                                i2 = i8;
                                pairArr3[i2] = new Pair(obj2, objB4);
                                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr4;
                                superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                                superPassVerificationStatusComponent$nextSteps$1.I$0 = 2;
                                superPassVerificationStatusComponent$nextSteps$1.label = 5;
                                objB4 = stringProvider.b(StringEnum.DOCUMENTS_INVALID, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                                if (objB4 != coroutineSingletons) {
                                    pairArr5 = pairArr4;
                                    pairArr6 = pairArr5;
                                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                                    superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                                    superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                                    superPassVerificationStatusComponent$nextSteps$1.label = 6;
                                    objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                                    if (objB3 != coroutineSingletons) {
                                        Pair[] pairArr10 = pairArr5;
                                        obj3 = objB4;
                                        objB4 = objB3;
                                        pairArr7 = pairArr6;
                                        pairArr8 = pairArr10;
                                        i3 = i6;
                                        pairArr8[i3] = new Pair(obj3, objB4);
                                        return CollectionsKt.S(pairArr7);
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                i = superPassVerificationStatusComponent$nextSteps$1.I$0;
                Pair[] pairArr11 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                Pair[] pairArr12 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                pairArr2 = pairArr12;
                pairArr = pairArr11;
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr2;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr;
                superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = i;
                superPassVerificationStatusComponent$nextSteps$1.label = 2;
                objB = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_ONE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB != coroutineSingletons) {
                    obj = objB4;
                    objB4 = objB;
                    pairArr[i] = new Pair(obj, objB4);
                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr2;
                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr2;
                    superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                    superPassVerificationStatusComponent$nextSteps$1.I$0 = 1;
                    superPassVerificationStatusComponent$nextSteps$1.label = 3;
                    objB4 = stringProvider.b(StringEnum.PAYMENT_FOR_PASS, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                    if (objB4 != coroutineSingletons) {
                        pairArr3 = pairArr2;
                        pairArr4 = pairArr3;
                        superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                        superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr3;
                        superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                        superPassVerificationStatusComponent$nextSteps$1.I$0 = i7;
                        superPassVerificationStatusComponent$nextSteps$1.label = 4;
                        objB2 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_TWO, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                        if (objB2 != coroutineSingletons) {
                            int i9 = i7;
                            obj2 = objB4;
                            objB4 = objB2;
                            i2 = i9;
                            pairArr3[i2] = new Pair(obj2, objB4);
                            superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                            superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr4;
                            superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                            superPassVerificationStatusComponent$nextSteps$1.I$0 = 2;
                            superPassVerificationStatusComponent$nextSteps$1.label = 5;
                            objB4 = stringProvider.b(StringEnum.DOCUMENTS_INVALID, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                            if (objB4 != coroutineSingletons) {
                                pairArr5 = pairArr4;
                                pairArr6 = pairArr5;
                                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                                superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                                superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                                superPassVerificationStatusComponent$nextSteps$1.label = 6;
                                objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                                if (objB3 != coroutineSingletons) {
                                    Pair[] pairArr13 = pairArr5;
                                    obj3 = objB4;
                                    objB4 = objB3;
                                    pairArr7 = pairArr6;
                                    pairArr8 = pairArr13;
                                    i3 = i6;
                                    pairArr8[i3] = new Pair(obj3, objB4);
                                    return CollectionsKt.S(pairArr7);
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                i = superPassVerificationStatusComponent$nextSteps$1.I$0;
                obj = superPassVerificationStatusComponent$nextSteps$1.L$2;
                pairArr = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                pairArr2 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                pairArr[i] = new Pair(obj, objB4);
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr2;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr2;
                superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = 1;
                superPassVerificationStatusComponent$nextSteps$1.label = 3;
                objB4 = stringProvider.b(StringEnum.PAYMENT_FOR_PASS, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB4 != coroutineSingletons) {
                    pairArr3 = pairArr2;
                    pairArr4 = pairArr3;
                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr3;
                    superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                    superPassVerificationStatusComponent$nextSteps$1.I$0 = i7;
                    superPassVerificationStatusComponent$nextSteps$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_TWO, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                    if (objB2 != coroutineSingletons) {
                        int i10 = i7;
                        obj2 = objB4;
                        objB4 = objB2;
                        i2 = i10;
                        pairArr3[i2] = new Pair(obj2, objB4);
                        superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                        superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr4;
                        superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                        superPassVerificationStatusComponent$nextSteps$1.I$0 = 2;
                        superPassVerificationStatusComponent$nextSteps$1.label = 5;
                        objB4 = stringProvider.b(StringEnum.DOCUMENTS_INVALID, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                        if (objB4 != coroutineSingletons) {
                            pairArr5 = pairArr4;
                            pairArr6 = pairArr5;
                            superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                            superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                            superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                            superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                            superPassVerificationStatusComponent$nextSteps$1.label = 6;
                            objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                            if (objB3 != coroutineSingletons) {
                                Pair[] pairArr14 = pairArr5;
                                obj3 = objB4;
                                objB4 = objB3;
                                pairArr7 = pairArr6;
                                pairArr8 = pairArr14;
                                i3 = i6;
                                pairArr8[i3] = new Pair(obj3, objB4);
                                return CollectionsKt.S(pairArr7);
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                i7 = superPassVerificationStatusComponent$nextSteps$1.I$0;
                Pair[] pairArr15 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                Pair[] pairArr16 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                pairArr4 = pairArr16;
                pairArr3 = pairArr15;
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr3;
                superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = i7;
                superPassVerificationStatusComponent$nextSteps$1.label = 4;
                objB2 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_TWO, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB2 != coroutineSingletons) {
                    int i11 = i7;
                    obj2 = objB4;
                    objB4 = objB2;
                    i2 = i11;
                    pairArr3[i2] = new Pair(obj2, objB4);
                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr4;
                    superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                    superPassVerificationStatusComponent$nextSteps$1.I$0 = 2;
                    superPassVerificationStatusComponent$nextSteps$1.label = 5;
                    objB4 = stringProvider.b(StringEnum.DOCUMENTS_INVALID, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                    if (objB4 != coroutineSingletons) {
                        pairArr5 = pairArr4;
                        pairArr6 = pairArr5;
                        superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                        superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                        superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                        superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                        superPassVerificationStatusComponent$nextSteps$1.label = 6;
                        objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                        if (objB3 != coroutineSingletons) {
                            Pair[] pairArr17 = pairArr5;
                            obj3 = objB4;
                            objB4 = objB3;
                            pairArr7 = pairArr6;
                            pairArr8 = pairArr17;
                            i3 = i6;
                            pairArr8[i3] = new Pair(obj3, objB4);
                            return CollectionsKt.S(pairArr7);
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                i2 = superPassVerificationStatusComponent$nextSteps$1.I$0;
                obj2 = superPassVerificationStatusComponent$nextSteps$1.L$2;
                pairArr3 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                pairArr4 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                pairArr3[i2] = new Pair(obj2, objB4);
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr4;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr4;
                superPassVerificationStatusComponent$nextSteps$1.L$2 = null;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = 2;
                superPassVerificationStatusComponent$nextSteps$1.label = 5;
                objB4 = stringProvider.b(StringEnum.DOCUMENTS_INVALID, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB4 != coroutineSingletons) {
                    pairArr5 = pairArr4;
                    pairArr6 = pairArr5;
                    superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                    superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                    superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                    superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                    superPassVerificationStatusComponent$nextSteps$1.label = 6;
                    objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                    if (objB3 != coroutineSingletons) {
                        Pair[] pairArr18 = pairArr5;
                        obj3 = objB4;
                        objB4 = objB3;
                        pairArr7 = pairArr6;
                        pairArr8 = pairArr18;
                        i3 = i6;
                        pairArr8[i3] = new Pair(obj3, objB4);
                        return CollectionsKt.S(pairArr7);
                    }
                }
                return coroutineSingletons;
            case 5:
                i6 = superPassVerificationStatusComponent$nextSteps$1.I$0;
                pairArr5 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                pairArr6 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                superPassVerificationStatusComponent$nextSteps$1.L$0 = pairArr6;
                superPassVerificationStatusComponent$nextSteps$1.L$1 = pairArr5;
                superPassVerificationStatusComponent$nextSteps$1.L$2 = objB4;
                superPassVerificationStatusComponent$nextSteps$1.I$0 = i6;
                superPassVerificationStatusComponent$nextSteps$1.label = 6;
                objB3 = stringProvider.b(StringEnum.VERIFICATION_SUBMISSION_STEP_THREE, new Object[0], superPassVerificationStatusComponent$nextSteps$1);
                if (objB3 != coroutineSingletons) {
                    Pair[] pairArr19 = pairArr5;
                    obj3 = objB4;
                    objB4 = objB3;
                    pairArr7 = pairArr6;
                    pairArr8 = pairArr19;
                    i3 = i6;
                    pairArr8[i3] = new Pair(obj3, objB4);
                    return CollectionsKt.S(pairArr7);
                }
                return coroutineSingletons;
            case 6:
                i3 = superPassVerificationStatusComponent$nextSteps$1.I$0;
                obj3 = superPassVerificationStatusComponent$nextSteps$1.L$2;
                pairArr8 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$1;
                pairArr7 = (Pair[]) superPassVerificationStatusComponent$nextSteps$1.L$0;
                ResultKt.b(objB4);
                pairArr8[i3] = new Pair(obj3, objB4);
                return CollectionsKt.S(pairArr7);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void I0(SuperPassVerificationStatusIntent superPassVerificationStatusIntent) {
        C0(superPassVerificationStatusIntent);
        if (superPassVerificationStatusIntent instanceof SuperPassVerificationStatusIntent.InitializationIntent) {
            BuildersKt.d(this.j, null, null, new SuperPassVerificationStatusComponent$handleInitializationIntent$1((SuperPassVerificationStatusIntent.InitializationIntent) superPassVerificationStatusIntent, this, null), 3);
        } else if (superPassVerificationStatusIntent.equals(SuperPassVerificationStatusIntent.PositiveBtnClickedIntent.f8517a)) {
            J0(this, "mPass verification status ok clicked", null, null, 14);
            G0();
        } else {
            if (!superPassVerificationStatusIntent.equals(SuperPassVerificationStatusIntent.ReportProblemIntent.f8518a)) {
                throw new NoWhenBranchMatchedException();
            }
            w0(new SuperPassVerificationStatusComponent$handleReportProblemIntent$1(this, null));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new SuperPassVerificationStatusDataState(null, new MPassVerificationTimingDetails(), "");
    }
}
