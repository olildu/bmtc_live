package app.chalo.deeplink;

import app.chalo.login.manager.DpdpaConsentManager;
import app.chalo.providers.CoroutineContextProvider;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.UserConsentScreenArgs;
import app.chalo.userconsent.UserConsentFlowType;
import app.chalo.utils.KUUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lapp/chalo/deeplink/DefaultDeepLinkConsentManager;", "Lapp/chalo/deeplink/DeepLinkConsentManager;", "InFlightConsentRequest", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DefaultDeepLinkConsentManager implements DeepLinkConsentManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DpdpaConsentManager f2472a;
    public final ChaloNavigationManager b;
    public final UserConsentResultStateManager c;
    public final ContextScope d;
    public final MutableStateFlow e;
    public InFlightConsentRequest f;
    public final Flow g;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/deeplink/DefaultDeepLinkConsentManager$InFlightConsentRequest;", "", "login_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class InFlightConsentRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f2473a;
        public final Job b;

        public InFlightConsentRequest(String str, Job job) {
            this.f2473a = str;
            this.b = job;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InFlightConsentRequest)) {
                return false;
            }
            InFlightConsentRequest inFlightConsentRequest = (InFlightConsentRequest) obj;
            return Intrinsics.d(this.f2473a, inFlightConsentRequest.f2473a) && Intrinsics.d(this.b, inFlightConsentRequest.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f2473a.hashCode() * 31);
        }

        public final String toString() {
            return "InFlightConsentRequest(requestId=" + this.f2473a + ", job=" + this.b + ")";
        }
    }

    public DefaultDeepLinkConsentManager(DpdpaConsentManager dpdpaConsentManager, ChaloNavigationManager chaloNavigationManager, UserConsentResultStateManager userConsentResultStateManager, CoroutineContextProvider coroutineContextProvider) {
        this.f2472a = dpdpaConsentManager;
        this.b = chaloNavigationManager;
        this.c = userConsentResultStateManager;
        this.d = CoroutineScopeKt.a(coroutineContextProvider.a().plus(SupervisorKt.b()));
        MutableStateFlow mutableStateFlowA = StateFlowKt.a(Boolean.FALSE);
        this.e = mutableStateFlowA;
        this.g = mutableStateFlowA;
    }

    @Override // app.chalo.deeplink.DeepLinkConsentManager
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Flow getG() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.deeplink.DeepLinkConsentManager
    public final Object b(ContinuationImpl continuationImpl) {
        DefaultDeepLinkConsentManager$ensureConsent$1 defaultDeepLinkConsentManager$ensureConsent$1;
        if (continuationImpl instanceof DefaultDeepLinkConsentManager$ensureConsent$1) {
            defaultDeepLinkConsentManager$ensureConsent$1 = (DefaultDeepLinkConsentManager$ensureConsent$1) continuationImpl;
            int i = defaultDeepLinkConsentManager$ensureConsent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                defaultDeepLinkConsentManager$ensureConsent$1.label = i - Integer.MIN_VALUE;
            } else {
                defaultDeepLinkConsentManager$ensureConsent$1 = new DefaultDeepLinkConsentManager$ensureConsent$1(this, continuationImpl);
            }
        } else {
            defaultDeepLinkConsentManager$ensureConsent$1 = new DefaultDeepLinkConsentManager$ensureConsent$1(this, continuationImpl);
        }
        Object objE = defaultDeepLinkConsentManager$ensureConsent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = defaultDeepLinkConsentManager$ensureConsent$1.label;
        if (i2 == 0) {
            ResultKt.b(objE);
            defaultDeepLinkConsentManager$ensureConsent$1.label = 1;
            objE = this.f2472a.e(defaultDeepLinkConsentManager$ensureConsent$1);
            if (objE == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objE);
        }
        boolean zBooleanValue = ((Boolean) objE).booleanValue();
        MutableStateFlow mutableStateFlow = this.e;
        if (!zBooleanValue) {
            mutableStateFlow.setValue(Boolean.FALSE);
            InFlightConsentRequest inFlightConsentRequest = this.f;
            if (inFlightConsentRequest != null) {
                ((JobSupport) inFlightConsentRequest.b).cancel(null);
            }
            this.f = null;
            return DeepLinkConsentManager.ConsentStatus.Granted.f2444a;
        }
        mutableStateFlow.setValue(Boolean.TRUE);
        InFlightConsentRequest inFlightConsentRequest2 = this.f;
        DeepLinkConsentManager.ConsentStatus.RequestLaunched requestLaunched = DeepLinkConsentManager.ConsentStatus.RequestLaunched.f2445a;
        if (inFlightConsentRequest2 != null) {
            return requestLaunched;
        }
        String strA = KUUID.a();
        this.f = new InFlightConsentRequest(strA, BuildersKt.d(this.d, null, null, new DefaultDeepLinkConsentManager$ensureConsent$job$1(this, strA, null), 3));
        ChaloNavigationManagerKt.e(this.b, new UserConsentScreenArgs(new UserConsentFlowType.ExistingUser(false, true), strA), null, 6);
        return requestLaunched;
    }
}
