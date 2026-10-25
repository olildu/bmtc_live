package app.chalo.login.ui.userconsent;

import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.login.data.models.app.DpdpaConsentInfoAppModel;
import app.chalo.login.data.models.app.DpdpaConsentStatus;
import app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel;
import app.chalo.login.domain.CheckIfSkipConsentOptionAvailableUseCase;
import app.chalo.login.domain.UpdateUserConsentUseCaseKt;
import app.chalo.login.domain.UserConsentUpdateFailureReason;
import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.providers.toast.KotlinToastManagerKt;
import app.chalo.providers.toast.ToastLength;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.uistate.webview.WebViewJSInterfaceSpecs;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.userprofile.domain.LogoutUserUseCase;
import app.chalo.utils.ChaloUseCaseResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.ln1;
import defpackage.sh1;
import defpackage.vm1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/login/ui/userconsent/UserConsentComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/login/ui/userconsent/UserConsentIntent;", "Lapp/chalo/login/ui/userconsent/UserConsentDataState;", "Lapp/chalo/login/ui/userconsent/UserConsentUIState;", "Lapp/chalo/login/ui/userconsent/UserConsentSideEffect;", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UserConsentComponent extends ChaloBaseStateMviComponent<UserConsentIntent, UserConsentDataState, UserConsentUIState, UserConsentSideEffect> {
    public final UserConsentScreenArgs k;
    public final DpdpaConsentManager l;
    public final UserProfileDetailsProvider m;
    public final StringProvider n;
    public final LogoutUserUseCase o;
    public final CrashlyticsLogger p;
    public final CheckIfSkipConsentOptionAvailableUseCase q;
    public final KotlinToastManager r;
    public final ChaloNavigationManager s;
    public final UserConsentResultStateManager t;
    public boolean u;
    public Job v;
    public final List w;

    public UserConsentComponent(UserConsentScreenArgs userConsentScreenArgs, ComponentContext componentContext, DpdpaConsentManager dpdpaConsentManager, UserProfileDetailsProvider userProfileDetailsProvider, StringProvider stringProvider, LogoutUserUseCase logoutUserUseCase, CrashlyticsLogger crashlyticsLogger, CheckIfSkipConsentOptionAvailableUseCase checkIfSkipConsentOptionAvailableUseCase, KotlinToastManager kotlinToastManager, ChaloNavigationManager chaloNavigationManager, UserConsentResultStateManager userConsentResultStateManager) {
        super(componentContext);
        this.k = userConsentScreenArgs;
        this.l = dpdpaConsentManager;
        this.m = userProfileDetailsProvider;
        this.n = stringProvider;
        this.o = logoutUserUseCase;
        this.p = crashlyticsLogger;
        this.q = checkIfSkipConsentOptionAvailableUseCase;
        this.r = kotlinToastManager;
        this.s = chaloNavigationManager;
        this.t = userConsentResultStateManager;
        this.u = true;
        this.w = CollectionsKt.R(new WebViewJSInterfaceSpecs(new UserConsentJSInterface(new ln1(this, 3), new ln1(this, 4), new ln1(this, 5))));
        L0(new UserConsentIntent.InitializationIntent(userConsentScreenArgs.b));
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:46:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00db A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00df  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:59:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:66:0x010d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ff, code lost:
    
        if (r12 == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.login.ui.userconsent.UserConsentComponent r10, app.chalo.userconsent.UserConsentFlowType r11, kotlin.coroutines.jvm.internal.ContinuationImpl r12) {
        /*
            Method dump skipped, instruction units count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.userconsent.UserConsentComponent.F0(app.chalo.login.ui.userconsent.UserConsentComponent, app.chalo.userconsent.UserConsentFlowType, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ArrayList G0(UserConsentComponent userConsentComponent, List list, DpdpaConsentStatus status) {
        userConsentComponent.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.v(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            String id = ((DpdpaConsentInfoAppModel) it.next()).f5190a;
            Intrinsics.i(id, "id");
            Intrinsics.i(status, "status");
            arrayList.add(new DpdpaConsentInfoAppModel(id, status));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object H0(UserConsentComponent userConsentComponent, UserProfileAppModel userProfileAppModel, ArrayList arrayList, ContinuationImpl continuationImpl) {
        UserConsentComponent$updateUserConsentWithServer$1 userConsentComponent$updateUserConsentWithServer$1;
        userConsentComponent.getClass();
        if (continuationImpl instanceof UserConsentComponent$updateUserConsentWithServer$1) {
            userConsentComponent$updateUserConsentWithServer$1 = (UserConsentComponent$updateUserConsentWithServer$1) continuationImpl;
            int i = userConsentComponent$updateUserConsentWithServer$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userConsentComponent$updateUserConsentWithServer$1.label = i - Integer.MIN_VALUE;
            } else {
                userConsentComponent$updateUserConsentWithServer$1 = new UserConsentComponent$updateUserConsentWithServer$1(userConsentComponent, continuationImpl);
            }
        } else {
            userConsentComponent$updateUserConsentWithServer$1 = new UserConsentComponent$updateUserConsentWithServer$1(userConsentComponent, continuationImpl);
        }
        Object objD = userConsentComponent$updateUserConsentWithServer$1.result;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userConsentComponent$updateUserConsentWithServer$1.label;
        Unit unit = Unit.f17538a;
        if (i2 == 0) {
            ResultKt.b(objD);
            DpdpaConsentManager dpdpaConsentManager = userConsentComponent.l;
            userConsentComponent$updateUserConsentWithServer$1.label = 1;
            objD = dpdpaConsentManager.d(userProfileAppModel, arrayList, userConsentComponent$updateUserConsentWithServer$1);
            if (objD != obj) {
            }
            return obj;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                ResultKt.b(objD);
                return unit;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objD);
            return unit;
        }
        ResultKt.b(objD);
        ChaloUseCaseResult chaloUseCaseResult = (ChaloUseCaseResult) objD;
        if (chaloUseCaseResult instanceof ChaloUseCaseResult.Success) {
            DpdpaUserConsentsInfoAppModel dpdpaUserConsentsInfoAppModel = (DpdpaUserConsentsInfoAppModel) ((ChaloUseCaseResult.Success) chaloUseCaseResult).f10419a;
            userConsentComponent$updateUserConsentWithServer$1.label = 2;
            if (userConsentComponent.N0(dpdpaUserConsentsInfoAppModel, userConsentComponent$updateUserConsentWithServer$1) == obj) {
                return obj;
            }
            return unit;
        }
        if (!(chaloUseCaseResult instanceof ChaloUseCaseResult.Failure)) {
            throw new NoWhenBranchMatchedException();
        }
        UserConsentUpdateFailureReason userConsentUpdateFailureReason = (UserConsentUpdateFailureReason) ((ChaloUseCaseResult.Failure) chaloUseCaseResult).f10418a;
        userConsentComponent$updateUserConsentWithServer$1.label = 3;
        if (userConsentComponent.M0(userConsentUpdateFailureReason, userConsentComponent$updateUserConsentWithServer$1) == obj) {
            return obj;
        }
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0111  */
    /* JADX WARN: Code duplicated, block: B:32:0x0146  */
    /* JADX WARN: Code duplicated, block: B:35:0x014b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0150  */
    /* JADX WARN: Code duplicated, block: B:39:0x0155  */
    /* JADX WARN: Code duplicated, block: B:42:0x0199  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:46:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:49:0x0256  */
    /* JADX WARN: Code duplicated, block: B:50:0x025b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0289  */
    /* JADX WARN: Code duplicated, block: B:56:0x0297  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00fb, code lost:
    
        if (r2 == r4) goto L26;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: I0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.login.ui.userconsent.UserConsentDataState r38, kotlin.coroutines.jvm.internal.ContinuationImpl r39) {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.userconsent.UserConsentComponent.p0(app.chalo.login.ui.userconsent.UserConsentDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Job J0(String str) {
        return BuildersKt.d(this.j, null, null, new UserConsentComponent$handleInvalidStateCondition$1(this, str, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object K0(ContinuationImpl continuationImpl) {
        UserConsentComponent$processEmptyConsentListOnFetch$1 userConsentComponent$processEmptyConsentListOnFetch$1;
        if (continuationImpl instanceof UserConsentComponent$processEmptyConsentListOnFetch$1) {
            userConsentComponent$processEmptyConsentListOnFetch$1 = (UserConsentComponent$processEmptyConsentListOnFetch$1) continuationImpl;
            int i = userConsentComponent$processEmptyConsentListOnFetch$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                userConsentComponent$processEmptyConsentListOnFetch$1.label = i - Integer.MIN_VALUE;
            } else {
                userConsentComponent$processEmptyConsentListOnFetch$1 = new UserConsentComponent$processEmptyConsentListOnFetch$1(this, continuationImpl);
            }
        } else {
            userConsentComponent$processEmptyConsentListOnFetch$1 = new UserConsentComponent$processEmptyConsentListOnFetch$1(this, continuationImpl);
        }
        Object obj = userConsentComponent$processEmptyConsentListOnFetch$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = userConsentComponent$processEmptyConsentListOnFetch$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            userConsentComponent$processEmptyConsentListOnFetch$1.label = 1;
            if (this.l.a(false, userConsentComponent$processEmptyConsentListOnFetch$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        this.p.i(new IllegalStateException("Empty consent list received in consent screen"));
        E0(new vm1(21));
        String str = this.k.c;
        if (str != null) {
            this.t.c(Boolean.TRUE, str);
        }
        ChaloNavigationManagerKt.c(this.s);
        return Unit.f17538a;
    }

    public final void L0(UserConsentIntent userConsentIntent) {
        C0(userConsentIntent);
        String message = "Processing intent: " + userConsentIntent;
        Intrinsics.i(message, "message");
        boolean z = userConsentIntent instanceof UserConsentIntent.InitializationIntent;
        boolean z2 = false;
        ContextScope contextScope = this.j;
        if (z) {
            UserConsentIntent.InitializationIntent initializationIntent = (UserConsentIntent.InitializationIntent) userConsentIntent;
            if (this.u) {
                this.u = false;
                BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleInitialisationIntent$1(this, initializationIntent, null), 3);
                return;
            }
            return;
        }
        boolean zEquals = userConsentIntent.equals(UserConsentIntent.RetryFetchIntent.f5355a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            UserConsentFlowType userConsentFlowType = ((UserConsentDataState) stateFlow.getValue()).f5349a;
            if (userConsentFlowType == null) {
                J0("FlowType null when retrying fetch call");
                return;
            }
            String str = ((UserConsentDataState) stateFlow.getValue()).c;
            if (str == null || str.length() == 0) {
                BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleRetryFetchIntent$1(this, userConsentFlowType, null), 3);
                return;
            } else {
                E0(new vm1(19));
                return;
            }
        }
        if (userConsentIntent.equals(UserConsentIntent.AcceptConsentIntent.f5350a)) {
            Job job = this.v;
            if (job == null || !((AbstractCoroutine) job).isActive()) {
                this.v = BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleAcceptConsentIntent$1(this, null), 3);
                return;
            }
            return;
        }
        if (userConsentIntent.equals(UserConsentIntent.DenyConsentIntent.f5352a)) {
            Job job2 = this.v;
            if (job2 == null || !((AbstractCoroutine) job2).isActive()) {
                this.v = BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleDenyConsentIntent$1(this, null), 3);
                return;
            }
            return;
        }
        if (userConsentIntent.equals(UserConsentIntent.BackClickedIntent.f5351a)) {
            UserConsentFlowType userConsentFlowType2 = ((UserConsentDataState) stateFlow.getValue()).f5349a;
            if (userConsentFlowType2 instanceof UserConsentFlowType.ExistingUser) {
                z2 = ((UserConsentFlowType.ExistingUser) userConsentFlowType2).b;
            } else if (!Intrinsics.d(userConsentFlowType2, UserConsentFlowType.FreshLogin.INSTANCE) && userConsentFlowType2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (z2) {
                ChaloNavigationManagerKt.c(this.s);
                return;
            }
            return;
        }
        if (userConsentIntent.equals(UserConsentIntent.DismissConsentRequiredDialog.f5353a)) {
            E0(new vm1(18));
            return;
        }
        if (userConsentIntent instanceof UserConsentIntent.WebViewPageLoadIntent) {
            E0(new sh1((UserConsentIntent.WebViewPageLoadIntent) userConsentIntent, 15));
        } else if (userConsentIntent.equals(UserConsentIntent.SkipConsentIntent.f5356a)) {
            BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleSkipConsentIntent$1(this, null), 3);
        } else {
            if (!userConsentIntent.equals(UserConsentIntent.WebViewErrorReceivedIntent.f5357a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new UserConsentComponent$handleWebViewErrorReceivedIntent$1(this, null), 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M0(UserConsentUpdateFailureReason userConsentUpdateFailureReason, ContinuationImpl continuationImpl) {
        UserConsentComponent$processUpdateConsentFailure$1 userConsentComponent$processUpdateConsentFailure$1;
        int i;
        KotlinToastManager kotlinToastManager;
        if (continuationImpl instanceof UserConsentComponent$processUpdateConsentFailure$1) {
            userConsentComponent$processUpdateConsentFailure$1 = (UserConsentComponent$processUpdateConsentFailure$1) continuationImpl;
            int i2 = userConsentComponent$processUpdateConsentFailure$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                userConsentComponent$processUpdateConsentFailure$1.label = i2 - Integer.MIN_VALUE;
            } else {
                userConsentComponent$processUpdateConsentFailure$1 = new UserConsentComponent$processUpdateConsentFailure$1(this, continuationImpl);
            }
        } else {
            userConsentComponent$processUpdateConsentFailure$1 = new UserConsentComponent$processUpdateConsentFailure$1(this, continuationImpl);
        }
        Object objB = userConsentComponent$processUpdateConsentFailure$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = userConsentComponent$processUpdateConsentFailure$1.label;
        if (i3 == 0) {
            ResultKt.b(objB);
            r0(UserConsentSideEffect.UpdateWebPageToStopLoading.f5364a);
            StringEnum stringEnum = StringEnum.SOMETHING_WENT_WRONG_WITH_ERROR_CODE;
            Intrinsics.i(userConsentUpdateFailureReason, "<this>");
            int i4 = UpdateUserConsentUseCaseKt.WhenMappings.f5252a[userConsentUpdateFailureReason.ordinal()];
            if (i4 == 1) {
                i = 101;
            } else if (i4 == 2) {
                i = 102;
            } else if (i4 == 3) {
                i = 103;
            } else if (i4 == 4) {
                i = 104;
            } else {
                if (i4 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = 105;
            }
            Object[] objArr = {new Integer(i)};
            KotlinToastManager kotlinToastManager2 = this.r;
            userConsentComponent$processUpdateConsentFailure$1.L$0 = kotlinToastManager2;
            userConsentComponent$processUpdateConsentFailure$1.label = 1;
            objB = this.n.b(stringEnum, objArr, userConsentComponent$processUpdateConsentFailure$1);
            if (objB == coroutineSingletons) {
                return coroutineSingletons;
            }
            kotlinToastManager = kotlinToastManager2;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlinToastManager = (KotlinToastManager) userConsentComponent$processUpdateConsentFailure$1.L$0;
            ResultKt.b(objB);
        }
        KotlinToastManagerKt.a(kotlinToastManager, (String) objB, ToastLength.LONG);
        return Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ea, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:
    
        if (r1 == r3) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012f, code lost:
    
        if (r8.a(false, r2) == r3) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N0(app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.login.ui.userconsent.UserConsentComponent.N0(app.chalo.login.data.models.app.DpdpaUserConsentsInfoAppModel, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new UserConsentDataState(null, null, null, false, null, false, false, false);
    }
}
