package app.chalo.userprofile.ui.minprofileupdate;

import androidx.media3.extractor.ts.PsExtractor;
import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.constants.Source;
import app.chalo.helper.ChaloAppFeatureHelper;
import app.chalo.login.userprofiling.ruleengine.UserProfilingHooksRuleEngineDataStore;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.resultstatemanager.minprofileupdate.MinProfileUpdateResult;
import app.chalo.userprofile.UserProfileAppModel;
import defpackage.za0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent$handleInitializationIntent$1", f = "MinProfileUpdateComponent.kt", l = {145, 154, 158, 162, 164, 165, 167, PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 1)
final class MinProfileUpdateComponent$handleInitializationIntent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ MinProfileUpdateComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MinProfileUpdateComponent$handleInitializationIntent$1(MinProfileUpdateComponent minProfileUpdateComponent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = minProfileUpdateComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MinProfileUpdateComponent$handleInitializationIntent$1 minProfileUpdateComponent$handleInitializationIntent$1 = new MinProfileUpdateComponent$handleInitializationIntent$1(this.this$0, continuation);
        minProfileUpdateComponent$handleInitializationIntent$1.L$0 = obj;
        return minProfileUpdateComponent$handleInitializationIntent$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((MinProfileUpdateComponent$handleInitializationIntent$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x009e A[Catch: CancellationException -> 0x0027, Exception -> 0x019c, TryCatch #4 {CancellationException -> 0x0027, Exception -> 0x019c, blocks: (B:9:0x0022, B:79:0x018d, B:14:0x0033, B:75:0x0178, B:17:0x0041, B:71:0x015a, B:20:0x004a, B:67:0x013e, B:60:0x0116, B:63:0x0120, B:59:0x0112, B:50:0x00dd, B:53:0x00e7, B:49:0x00d9, B:33:0x007c, B:39:0x0099, B:41:0x009e, B:43:0x00a4, B:36:0x0088), top: B:87:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a4 A[Catch: CancellationException -> 0x0027, Exception -> 0x019c, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x0027, Exception -> 0x019c, blocks: (B:9:0x0022, B:79:0x018d, B:14:0x0033, B:75:0x0178, B:17:0x0041, B:71:0x015a, B:20:0x004a, B:67:0x013e, B:60:0x0116, B:63:0x0120, B:59:0x0112, B:50:0x00dd, B:53:0x00e7, B:49:0x00d9, B:33:0x007c, B:39:0x0099, B:41:0x009e, B:43:0x00a4, B:36:0x0088), top: B:87:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00cd A[Catch: all -> 0x0075, PHI: r7 r8 r14
      0x00cd: PHI (r7v17 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent) = 
      (r7v16 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent)
      (r7v19 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent)
     binds: [B:45:0x00c9, B:28:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r8v10 app.chalo.userprofile.UserProfileAppModel) = (r8v9 app.chalo.userprofile.UserProfileAppModel), (r8v12 app.chalo.userprofile.UserProfileAppModel) binds: [B:45:0x00c9, B:28:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x00cd: PHI (r14v46 java.lang.Object) = (r14v44 java.lang.Object), (r14v0 java.lang.Object) binds: [B:45:0x00c9, B:28:0x0071] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {all -> 0x0075, blocks: (B:28:0x0071, B:47:0x00cd, B:44:0x00ba), top: B:87:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:56:0x0104  */
    /* JADX WARN: Code duplicated, block: B:57:0x0106 A[Catch: all -> 0x005f, PHI: r7 r8 r14
      0x0106: PHI (r7v5 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent) = 
      (r7v3 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent)
      (r7v21 app.chalo.userprofile.ui.minprofileupdate.MinProfileUpdateComponent)
     binds: [B:55:0x0102, B:23:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r8v4 app.chalo.userprofile.UserProfileAppModel) = (r8v10 app.chalo.userprofile.UserProfileAppModel), (r8v14 app.chalo.userprofile.UserProfileAppModel) binds: [B:55:0x0102, B:23:0x005a] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r14v20 java.lang.Object) = (r14v11 java.lang.Object), (r14v0 java.lang.Object) binds: [B:55:0x0102, B:23:0x005a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #3 {all -> 0x005f, blocks: (B:23:0x005a, B:57:0x0106, B:54:0x00f1), top: B:87:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x011f  */
    /* JADX WARN: Code duplicated, block: B:65:0x013b  */
    /* JADX WARN: Code duplicated, block: B:66:0x013d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0155  */
    /* JADX WARN: Code duplicated, block: B:70:0x0157  */
    /* JADX WARN: Code duplicated, block: B:73:0x0173  */
    /* JADX WARN: Code duplicated, block: B:74:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0189  */
    /* JADX WARN: Code duplicated, block: B:78:0x018a  */
    /* JADX WARN: Code duplicated, block: B:85:0x01c0 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Object objA2;
        Object l;
        MinProfileUpdateComponent minProfileUpdateComponent;
        Object l2;
        UserProfileAppModel userProfileAppModel;
        UserProfileAppModel userProfileAppModel2;
        boolean zBooleanValue;
        Object objA3;
        boolean z;
        boolean zBooleanValue2;
        Object objK;
        boolean z2;
        boolean z3;
        List list;
        Object objF0;
        List list2;
        CoroutineScope coroutineScope;
        MinProfileUpdateComponent minProfileUpdateComponent2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        MinProfileUpdateResult.Dismissed dismissed = MinProfileUpdateResult.Dismissed.f9057a;
        Unit unit = Unit.f17538a;
        try {
            try {
                try {
                    switch (i) {
                        case 0:
                            ResultKt.b(obj);
                            coroutineScope = (CoroutineScope) this.L$0;
                            UserProfileDetailsProvider userProfileDetailsProvider = this.this$0.l;
                            this.L$0 = coroutineScope;
                            this.label = 1;
                            obj = userProfileDetailsProvider.l(this);
                            if (obj != coroutineSingletons) {
                                userProfileAppModel2 = (UserProfileAppModel) obj;
                                if (userProfileAppModel2 == null) {
                                    this.this$0.K0(dismissed);
                                    return unit;
                                }
                                MinProfileUpdateComponent minProfileUpdateComponent3 = this.this$0;
                                minProfileUpdateComponent3.C = ((Boolean) minProfileUpdateComponent3.l.getG().getValue()).booleanValue();
                                minProfileUpdateComponent2 = this.this$0;
                                UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore = minProfileUpdateComponent2.z;
                                this.L$0 = coroutineScope;
                                this.L$1 = userProfileAppModel2;
                                this.L$2 = minProfileUpdateComponent2;
                                this.label = 2;
                                obj = userProfilingHooksRuleEngineDataStore.d(this);
                                if (obj == coroutineSingletons) {
                                    objA2 = new Long(((Number) obj).longValue());
                                    l = new Long(0L);
                                    if (objA2 instanceof Result.Failure) {
                                        objA2 = l;
                                    }
                                    minProfileUpdateComponent2.E = ((Number) objA2).longValue();
                                    minProfileUpdateComponent = this.this$0;
                                    UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore2 = minProfileUpdateComponent.z;
                                    String str = userProfileAppModel2.i;
                                    this.L$0 = userProfileAppModel2;
                                    this.L$1 = minProfileUpdateComponent;
                                    this.L$2 = null;
                                    this.label = 3;
                                    obj = userProfilingHooksRuleEngineDataStore2.c(str, this);
                                    if (obj != coroutineSingletons) {
                                        objA = new Long(((Number) obj).longValue());
                                        l2 = new Long(0L);
                                        if (objA instanceof Result.Failure) {
                                            objA = l2;
                                        }
                                        minProfileUpdateComponent.D = ((Number) objA).longValue();
                                        ChaloAppFeatureHelper chaloAppFeatureHelper = this.this$0.v;
                                        this.L$0 = userProfileAppModel2;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 4;
                                        obj = chaloAppFeatureHelper.t(this);
                                        if (obj == coroutineSingletons) {
                                            userProfileAppModel = userProfileAppModel2;
                                            zBooleanValue = ((Boolean) obj).booleanValue();
                                            ChaloAppFeatureHelper chaloAppFeatureHelper2 = this.this$0.v;
                                            this.L$0 = userProfileAppModel;
                                            this.Z$0 = zBooleanValue;
                                            this.label = 5;
                                            objA3 = chaloAppFeatureHelper2.a(this);
                                            if (objA3 != coroutineSingletons) {
                                                z = zBooleanValue;
                                                obj = objA3;
                                                zBooleanValue2 = ((Boolean) obj).booleanValue();
                                                ChaloAppFeatureHelper chaloAppFeatureHelper3 = this.this$0.v;
                                                this.L$0 = userProfileAppModel;
                                                this.Z$0 = z;
                                                this.Z$1 = zBooleanValue2;
                                                this.label = 6;
                                                objK = chaloAppFeatureHelper3.k(this);
                                                if (objK == coroutineSingletons) {
                                                    boolean z4 = z;
                                                    z2 = zBooleanValue2;
                                                    obj = objK;
                                                    z3 = z4;
                                                    list = (List) obj;
                                                    MinProfileUpdateComponent minProfileUpdateComponent4 = this.this$0;
                                                    this.L$0 = userProfileAppModel;
                                                    this.L$1 = list;
                                                    this.label = 7;
                                                    objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent4, userProfileAppModel, z3, z2, this);
                                                    if (objF0 != coroutineSingletons) {
                                                        list2 = list;
                                                        obj = objF0;
                                                        this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                                        MinProfileUpdateComponent minProfileUpdateComponent5 = this.this$0;
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.label = 8;
                                                        AnalyticsContractImplKt.b(minProfileUpdateComponent5.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent5.L0(), false, 24);
                                                        if (unit != coroutineSingletons) {
                                                            return unit;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 1:
                            coroutineScope = (CoroutineScope) this.L$0;
                            ResultKt.b(obj);
                            userProfileAppModel2 = (UserProfileAppModel) obj;
                            if (userProfileAppModel2 == null) {
                                this.this$0.K0(dismissed);
                                return unit;
                            }
                            MinProfileUpdateComponent minProfileUpdateComponent6 = this.this$0;
                            minProfileUpdateComponent6.C = ((Boolean) minProfileUpdateComponent6.l.getG().getValue()).booleanValue();
                            minProfileUpdateComponent2 = this.this$0;
                            UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore3 = minProfileUpdateComponent2.z;
                            this.L$0 = coroutineScope;
                            this.L$1 = userProfileAppModel2;
                            this.L$2 = minProfileUpdateComponent2;
                            this.label = 2;
                            obj = userProfilingHooksRuleEngineDataStore3.d(this);
                            if (obj == coroutineSingletons) {
                                objA2 = new Long(((Number) obj).longValue());
                                l = new Long(0L);
                                if (objA2 instanceof Result.Failure) {
                                    objA2 = l;
                                }
                                minProfileUpdateComponent2.E = ((Number) objA2).longValue();
                                minProfileUpdateComponent = this.this$0;
                                UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore4 = minProfileUpdateComponent.z;
                                String str2 = userProfileAppModel2.i;
                                this.L$0 = userProfileAppModel2;
                                this.L$1 = minProfileUpdateComponent;
                                this.L$2 = null;
                                this.label = 3;
                                obj = userProfilingHooksRuleEngineDataStore4.c(str2, this);
                                if (obj != coroutineSingletons) {
                                    objA = new Long(((Number) obj).longValue());
                                    l2 = new Long(0L);
                                    if (objA instanceof Result.Failure) {
                                        objA = l2;
                                    }
                                    minProfileUpdateComponent.D = ((Number) objA).longValue();
                                    ChaloAppFeatureHelper chaloAppFeatureHelper4 = this.this$0.v;
                                    this.L$0 = userProfileAppModel2;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 4;
                                    obj = chaloAppFeatureHelper4.t(this);
                                    if (obj == coroutineSingletons) {
                                        userProfileAppModel = userProfileAppModel2;
                                        zBooleanValue = ((Boolean) obj).booleanValue();
                                        ChaloAppFeatureHelper chaloAppFeatureHelper5 = this.this$0.v;
                                        this.L$0 = userProfileAppModel;
                                        this.Z$0 = zBooleanValue;
                                        this.label = 5;
                                        objA3 = chaloAppFeatureHelper5.a(this);
                                        if (objA3 != coroutineSingletons) {
                                            z = zBooleanValue;
                                            obj = objA3;
                                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                                            ChaloAppFeatureHelper chaloAppFeatureHelper6 = this.this$0.v;
                                            this.L$0 = userProfileAppModel;
                                            this.Z$0 = z;
                                            this.Z$1 = zBooleanValue2;
                                            this.label = 6;
                                            objK = chaloAppFeatureHelper6.k(this);
                                            if (objK == coroutineSingletons) {
                                                boolean z5 = z;
                                                z2 = zBooleanValue2;
                                                obj = objK;
                                                z3 = z5;
                                                list = (List) obj;
                                                MinProfileUpdateComponent minProfileUpdateComponent7 = this.this$0;
                                                this.L$0 = userProfileAppModel;
                                                this.L$1 = list;
                                                this.label = 7;
                                                objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent7, userProfileAppModel, z3, z2, this);
                                                if (objF0 != coroutineSingletons) {
                                                    list2 = list;
                                                    obj = objF0;
                                                    this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                                    MinProfileUpdateComponent minProfileUpdateComponent8 = this.this$0;
                                                    this.L$0 = null;
                                                    this.L$1 = null;
                                                    this.L$2 = null;
                                                    this.label = 8;
                                                    AnalyticsContractImplKt.b(minProfileUpdateComponent8.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent8.L0(), false, 24);
                                                    if (unit != coroutineSingletons) {
                                                        return unit;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 2:
                            minProfileUpdateComponent2 = (MinProfileUpdateComponent) this.L$2;
                            userProfileAppModel2 = (UserProfileAppModel) this.L$1;
                            ResultKt.b(obj);
                            objA2 = new Long(((Number) obj).longValue());
                            l = new Long(0L);
                            if (objA2 instanceof Result.Failure) {
                                objA2 = l;
                            }
                            minProfileUpdateComponent2.E = ((Number) objA2).longValue();
                            minProfileUpdateComponent = this.this$0;
                            UserProfilingHooksRuleEngineDataStore userProfilingHooksRuleEngineDataStore5 = minProfileUpdateComponent.z;
                            String str3 = userProfileAppModel2.i;
                            this.L$0 = userProfileAppModel2;
                            this.L$1 = minProfileUpdateComponent;
                            this.L$2 = null;
                            this.label = 3;
                            obj = userProfilingHooksRuleEngineDataStore5.c(str3, this);
                            if (obj != coroutineSingletons) {
                                objA = new Long(((Number) obj).longValue());
                                l2 = new Long(0L);
                                if (objA instanceof Result.Failure) {
                                    objA = l2;
                                }
                                minProfileUpdateComponent.D = ((Number) objA).longValue();
                                ChaloAppFeatureHelper chaloAppFeatureHelper7 = this.this$0.v;
                                this.L$0 = userProfileAppModel2;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 4;
                                obj = chaloAppFeatureHelper7.t(this);
                                if (obj == coroutineSingletons) {
                                    userProfileAppModel = userProfileAppModel2;
                                    zBooleanValue = ((Boolean) obj).booleanValue();
                                    ChaloAppFeatureHelper chaloAppFeatureHelper8 = this.this$0.v;
                                    this.L$0 = userProfileAppModel;
                                    this.Z$0 = zBooleanValue;
                                    this.label = 5;
                                    objA3 = chaloAppFeatureHelper8.a(this);
                                    if (objA3 != coroutineSingletons) {
                                        z = zBooleanValue;
                                        obj = objA3;
                                        zBooleanValue2 = ((Boolean) obj).booleanValue();
                                        ChaloAppFeatureHelper chaloAppFeatureHelper9 = this.this$0.v;
                                        this.L$0 = userProfileAppModel;
                                        this.Z$0 = z;
                                        this.Z$1 = zBooleanValue2;
                                        this.label = 6;
                                        objK = chaloAppFeatureHelper9.k(this);
                                        if (objK == coroutineSingletons) {
                                            boolean z6 = z;
                                            z2 = zBooleanValue2;
                                            obj = objK;
                                            z3 = z6;
                                            list = (List) obj;
                                            MinProfileUpdateComponent minProfileUpdateComponent9 = this.this$0;
                                            this.L$0 = userProfileAppModel;
                                            this.L$1 = list;
                                            this.label = 7;
                                            objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent9, userProfileAppModel, z3, z2, this);
                                            if (objF0 != coroutineSingletons) {
                                                list2 = list;
                                                obj = objF0;
                                                this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                                MinProfileUpdateComponent minProfileUpdateComponent10 = this.this$0;
                                                this.L$0 = null;
                                                this.L$1 = null;
                                                this.L$2 = null;
                                                this.label = 8;
                                                AnalyticsContractImplKt.b(minProfileUpdateComponent10.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent10.L0(), false, 24);
                                                if (unit != coroutineSingletons) {
                                                    return unit;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 3:
                            minProfileUpdateComponent = (MinProfileUpdateComponent) this.L$1;
                            userProfileAppModel2 = (UserProfileAppModel) this.L$0;
                            ResultKt.b(obj);
                            objA = new Long(((Number) obj).longValue());
                            l2 = new Long(0L);
                            if (objA instanceof Result.Failure) {
                                objA = l2;
                            }
                            minProfileUpdateComponent.D = ((Number) objA).longValue();
                            ChaloAppFeatureHelper chaloAppFeatureHelper10 = this.this$0.v;
                            this.L$0 = userProfileAppModel2;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 4;
                            obj = chaloAppFeatureHelper10.t(this);
                            if (obj == coroutineSingletons) {
                                userProfileAppModel = userProfileAppModel2;
                                zBooleanValue = ((Boolean) obj).booleanValue();
                                ChaloAppFeatureHelper chaloAppFeatureHelper11 = this.this$0.v;
                                this.L$0 = userProfileAppModel;
                                this.Z$0 = zBooleanValue;
                                this.label = 5;
                                objA3 = chaloAppFeatureHelper11.a(this);
                                if (objA3 != coroutineSingletons) {
                                    z = zBooleanValue;
                                    obj = objA3;
                                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                                    ChaloAppFeatureHelper chaloAppFeatureHelper12 = this.this$0.v;
                                    this.L$0 = userProfileAppModel;
                                    this.Z$0 = z;
                                    this.Z$1 = zBooleanValue2;
                                    this.label = 6;
                                    objK = chaloAppFeatureHelper12.k(this);
                                    if (objK == coroutineSingletons) {
                                        boolean z7 = z;
                                        z2 = zBooleanValue2;
                                        obj = objK;
                                        z3 = z7;
                                        list = (List) obj;
                                        MinProfileUpdateComponent minProfileUpdateComponent11 = this.this$0;
                                        this.L$0 = userProfileAppModel;
                                        this.L$1 = list;
                                        this.label = 7;
                                        objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent11, userProfileAppModel, z3, z2, this);
                                        if (objF0 != coroutineSingletons) {
                                            list2 = list;
                                            obj = objF0;
                                            this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                            MinProfileUpdateComponent minProfileUpdateComponent12 = this.this$0;
                                            this.L$0 = null;
                                            this.L$1 = null;
                                            this.L$2 = null;
                                            this.label = 8;
                                            AnalyticsContractImplKt.b(minProfileUpdateComponent12.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent12.L0(), false, 24);
                                            if (unit != coroutineSingletons) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 4:
                            UserProfileAppModel userProfileAppModel3 = (UserProfileAppModel) this.L$0;
                            ResultKt.b(obj);
                            userProfileAppModel = userProfileAppModel3;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            ChaloAppFeatureHelper chaloAppFeatureHelper13 = this.this$0.v;
                            this.L$0 = userProfileAppModel;
                            this.Z$0 = zBooleanValue;
                            this.label = 5;
                            objA3 = chaloAppFeatureHelper13.a(this);
                            if (objA3 != coroutineSingletons) {
                                z = zBooleanValue;
                                obj = objA3;
                                zBooleanValue2 = ((Boolean) obj).booleanValue();
                                ChaloAppFeatureHelper chaloAppFeatureHelper14 = this.this$0.v;
                                this.L$0 = userProfileAppModel;
                                this.Z$0 = z;
                                this.Z$1 = zBooleanValue2;
                                this.label = 6;
                                objK = chaloAppFeatureHelper14.k(this);
                                if (objK == coroutineSingletons) {
                                    boolean z8 = z;
                                    z2 = zBooleanValue2;
                                    obj = objK;
                                    z3 = z8;
                                    list = (List) obj;
                                    MinProfileUpdateComponent minProfileUpdateComponent13 = this.this$0;
                                    this.L$0 = userProfileAppModel;
                                    this.L$1 = list;
                                    this.label = 7;
                                    objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent13, userProfileAppModel, z3, z2, this);
                                    if (objF0 != coroutineSingletons) {
                                        list2 = list;
                                        obj = objF0;
                                        this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                        MinProfileUpdateComponent minProfileUpdateComponent14 = this.this$0;
                                        this.L$0 = null;
                                        this.L$1 = null;
                                        this.L$2 = null;
                                        this.label = 8;
                                        AnalyticsContractImplKt.b(minProfileUpdateComponent14.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent14.L0(), false, 24);
                                        if (unit != coroutineSingletons) {
                                            return unit;
                                        }
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 5:
                            z = this.Z$0;
                            userProfileAppModel = (UserProfileAppModel) this.L$0;
                            ResultKt.b(obj);
                            zBooleanValue2 = ((Boolean) obj).booleanValue();
                            ChaloAppFeatureHelper chaloAppFeatureHelper15 = this.this$0.v;
                            this.L$0 = userProfileAppModel;
                            this.Z$0 = z;
                            this.Z$1 = zBooleanValue2;
                            this.label = 6;
                            objK = chaloAppFeatureHelper15.k(this);
                            if (objK == coroutineSingletons) {
                                boolean z9 = z;
                                z2 = zBooleanValue2;
                                obj = objK;
                                z3 = z9;
                                list = (List) obj;
                                MinProfileUpdateComponent minProfileUpdateComponent15 = this.this$0;
                                this.L$0 = userProfileAppModel;
                                this.L$1 = list;
                                this.label = 7;
                                objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent15, userProfileAppModel, z3, z2, this);
                                if (objF0 != coroutineSingletons) {
                                    list2 = list;
                                    obj = objF0;
                                    this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                    MinProfileUpdateComponent minProfileUpdateComponent16 = this.this$0;
                                    this.L$0 = null;
                                    this.L$1 = null;
                                    this.L$2 = null;
                                    this.label = 8;
                                    AnalyticsContractImplKt.b(minProfileUpdateComponent16.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent16.L0(), false, 24);
                                    if (unit != coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                            return coroutineSingletons;
                        case 6:
                            z2 = this.Z$1;
                            boolean z10 = this.Z$0;
                            UserProfileAppModel userProfileAppModel4 = (UserProfileAppModel) this.L$0;
                            ResultKt.b(obj);
                            z3 = z10;
                            userProfileAppModel = userProfileAppModel4;
                            list = (List) obj;
                            MinProfileUpdateComponent minProfileUpdateComponent17 = this.this$0;
                            this.L$0 = userProfileAppModel;
                            this.L$1 = list;
                            this.label = 7;
                            objF0 = MinProfileUpdateComponent.F0(minProfileUpdateComponent17, userProfileAppModel, z3, z2, this);
                            if (objF0 != coroutineSingletons) {
                                list2 = list;
                                obj = objF0;
                                this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                                MinProfileUpdateComponent minProfileUpdateComponent18 = this.this$0;
                                this.L$0 = null;
                                this.L$1 = null;
                                this.L$2 = null;
                                this.label = 8;
                                AnalyticsContractImplKt.b(minProfileUpdateComponent18.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent18.L0(), false, 24);
                                if (unit != coroutineSingletons) {
                                    return unit;
                                }
                            }
                            return coroutineSingletons;
                        case 7:
                            list2 = (List) this.L$1;
                            userProfileAppModel = (UserProfileAppModel) this.L$0;
                            ResultKt.b(obj);
                            this.this$0.E0(new za0(11, userProfileAppModel, (List) obj, list2));
                            MinProfileUpdateComponent minProfileUpdateComponent19 = this.this$0;
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.label = 8;
                            AnalyticsContractImplKt.b(minProfileUpdateComponent19.y, "minProfile screen opened", Source.MIN_PROFILE_UPDATE_SCREEN, minProfileUpdateComponent19.L0(), false, 24);
                            if (unit != coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            return unit;
                        case 8:
                            ResultKt.b(obj);
                            return unit;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } catch (Throwable th) {
                    objA2 = ResultKt.a(th);
                }
            } catch (Throwable th2) {
                objA = ResultKt.a(th2);
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            this.this$0.K0(dismissed);
        }
    }
}
