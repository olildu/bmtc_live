package app.chalo.sos;

import app.chalo.analytics.AnalyticsContractImplKt;
import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.constants.Source;
import app.chalo.features.chalotime.ChaloTimeProvider;
import app.chalo.location.ChaloLocationManager;
import app.chalo.location.LocationUpdateResult;
import app.chalo.models.LocationAppModel;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.cityprovider.CityProvider;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.SosArgs;
import app.chalo.sos.feature.SosContactsFeature;
import app.chalo.sos.official.GetOfficialSosContactsUseCase;
import app.chalo.usecase.RaiseSOSUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import com.adjust.sdk.Constants;
import com.arkivanov.decompose.ComponentContext;
import defpackage.h81;
import defpackage.l91;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/sos/SosScreenComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/sos/SosScreenIntent;", "Lapp/chalo/sos/SosScreenDataState;", "Lapp/chalo/sos/SosScreenUIState;", "Lapp/chalo/sos/SosScreenEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SosScreenComponent extends ChaloBaseStateMviComponent<SosScreenIntent, SosScreenDataState, SosScreenUIState, SosScreenEffect> {
    public final SosContactsFeature k;
    public final ChaloNavigationManager l;
    public final KotlinToastManager m;
    public final StringProvider n;
    public final SosScreenUIStateFactory o;
    public final AnalyticsContract p;
    public final UserProfileDetailsProvider q;
    public final ChaloTimeProvider r;
    public final ChaloLocationManager s;
    public final RaiseSOSUseCase t;
    public final CityProvider u;
    public final GetOfficialSosContactsUseCase v;
    public Job w;
    public Job x;
    public Job y;
    public Job z;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lapp/chalo/sos/SosScreenComponent$Companion;", "", "", "SOS_MESSAGE_LENGTH", "I", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9401a;

        static {
            int[] iArr = new int[SosScreenType.values().length];
            try {
                iArr[SosScreenType.DISPLAY_SCREEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SosScreenType.MSG_EDIT_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f9401a = iArr;
        }
    }

    public SosScreenComponent(SosArgs sosArgs, ComponentContext componentContext, SosContactsFeature sosContactsFeature, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, StringProvider stringProvider, SosScreenUIStateFactory sosScreenUIStateFactory, AnalyticsContract analyticsContract, UserProfileDetailsProvider userProfileDetailsProvider, ChaloTimeProvider chaloTimeProvider, ChaloLocationManager chaloLocationManager, RaiseSOSUseCase raiseSOSUseCase, CityProvider cityProvider, GetOfficialSosContactsUseCase getOfficialSosContactsUseCase) {
        super(componentContext);
        this.k = sosContactsFeature;
        this.l = chaloNavigationManager;
        this.m = kotlinToastManager;
        this.n = stringProvider;
        this.o = sosScreenUIStateFactory;
        this.p = analyticsContract;
        this.q = userProfileDetailsProvider;
        this.r = chaloTimeProvider;
        this.s = chaloLocationManager;
        this.t = raiseSOSUseCase;
        this.u = cityProvider;
        this.v = getOfficialSosContactsUseCase;
        F0(new SosScreenIntent.InitialisationIntent(sosArgs.b));
    }

    public final void F0(SosScreenIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean z = intent instanceof SosScreenIntent.InitialisationIntent;
        ContextScope contextScope = this.j;
        if (z) {
            E0(new l91((SosScreenIntent.InitialisationIntent) intent, 8));
            BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleInitialisationIntent$2(this, null), 3);
            return;
        }
        boolean zEquals = intent.equals(SosScreenIntent.BackClickedIntent.f9408a);
        StateFlow stateFlow = this.f;
        if (zEquals) {
            int i = WhenMappings.f9401a[((SosScreenDataState) stateFlow.getValue()).e.ordinal()];
            if (i == 1) {
                ChaloNavigationManagerKt.c(this.l);
                return;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                E0(new h81(24));
                return;
            }
        }
        if (intent.equals(SosScreenIntent.EditMsgClickedIntent.f9411a)) {
            E0(new h81(25));
            return;
        }
        if (intent instanceof SosScreenIntent.RemoveContactIntent) {
            BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleRemoveContactIntent$1(this, (SosScreenIntent.RemoveContactIntent) intent, null), 3);
            return;
        }
        if (intent.equals(SosScreenIntent.SaveSosMessageIntent.f9414a)) {
            BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleSaveSosMessageIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof SosScreenIntent.SosMessageEnteredIntent) {
            E0(new l91((SosScreenIntent.SosMessageEnteredIntent) intent, 7));
            return;
        }
        if (intent.equals(SosScreenIntent.SendAlertClickedIntent.f9415a)) {
            BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleSendAlertClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(SosScreenIntent.DismissDialogIntent.f9410a)) {
            E0(new h81(23));
            return;
        }
        if (intent.equals(SosScreenIntent.ConfirmSendAlertIntent.f9409a)) {
            BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleConfirmSendAlertIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(SosScreenIntent.AddContactsClickedIntent.f9407a)) {
            Job job = this.z;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.z = BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleAddContactsClickedIntent$1(this, null), 3);
            return;
        }
        if (!intent.equals(SosScreenIntent.SendSOSMessageIntent.f9416a)) {
            throw new NoWhenBranchMatchedException();
        }
        BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleSendSOSMessage$1(this, null), 3);
        Map map = ((SosScreenDataState) stateFlow.getValue()).g;
        if (map == null || map.isEmpty()) {
            return;
        }
        BuildersKt.d(contextScope, null, null, new SosScreenComponent$handleSendSOSMessage$2(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:42:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object G0(String str, Boolean bool, ContinuationImpl continuationImpl) {
        SosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1 sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1;
        String str2;
        Boolean bool2;
        String str3;
        String str4;
        Boolean bool3;
        String str5;
        String str6;
        long j;
        LocationAppModel locationAppModelA;
        Object num;
        Object num2;
        LinkedHashMap linkedHashMapK;
        if (continuationImpl instanceof SosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1) {
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1 = (SosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1) continuationImpl;
            int i = sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.label = i - Integer.MIN_VALUE;
            } else {
                sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1 = new SosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1(this, continuationImpl);
            }
        } else {
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1 = new SosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1(this, continuationImpl);
        }
        Object objA = sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            UserProfileAppModel userProfileAppModelF = this.q.f();
            if (userProfileAppModelF == null || (str2 = userProfileAppModelF.e) == null) {
                str2 = "";
            }
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$0 = str;
            bool2 = bool;
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$1 = bool2;
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$2 = str2;
            sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.label = 1;
            Object objB = this.r.b(sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1);
            if (objB != coroutineSingletons) {
                str3 = str2;
                objA = objB;
                str4 = str;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            String str7 = (String) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$2;
            bool2 = (Boolean) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$1;
            String str8 = (String) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$0;
            ResultKt.b(objA);
            str3 = str7;
            str4 = str8;
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.J$0;
            str5 = (String) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$2;
            Boolean bool4 = (Boolean) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$1;
            String str9 = (String) sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$0;
            ResultKt.b(objA);
            str6 = str9;
            bool3 = bool4;
        }
        locationAppModelA = ((LocationUpdateResult) objA).a();
        if (locationAppModelA != null) {
            num = new Double(locationAppModelA.f5586a);
        } else {
            num = new Integer(-1);
        }
        if (locationAppModelA != null) {
            num2 = new Double(locationAppModelA.b);
        } else {
            num2 = new Integer(-1);
        }
        linkedHashMapK = MapsKt.k(new Pair("userMobile", str5), new Pair("lat", num), new Pair(Constants.LONG, num2), new Pair("timeStamp", new Long(j)));
        if (bool3 != null) {
            linkedHashMapK.put("sosSentSuccessfully", bool3);
        }
        AnalyticsContractImplKt.b(this.p, str6, Source.SOS_SCREEN, linkedHashMapK, false, 24);
        return Unit.f17538a;
        Long l = (Long) objA;
        long jLongValue = l != null ? l.longValue() : -1L;
        sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$0 = str4;
        sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$1 = bool2;
        sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.L$2 = str3;
        sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.J$0 = jLongValue;
        sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1.label = 2;
        objA = this.s.a(sosScreenComponent$raiseSendAlertClickedAnalyticsEvent$1);
        if (objA != coroutineSingletons) {
            bool3 = bool2;
            str5 = str3;
            str6 = str4;
            j = jLongValue;
            locationAppModelA = ((LocationUpdateResult) objA).a();
            if (locationAppModelA != null) {
                num = new Double(locationAppModelA.f5586a);
            } else {
                num = new Integer(-1);
            }
            if (locationAppModelA != null) {
                num2 = new Double(locationAppModelA.b);
            } else {
                num2 = new Integer(-1);
            }
            linkedHashMapK = MapsKt.k(new Pair("userMobile", str5), new Pair("lat", num), new Pair(Constants.LONG, num2), new Pair("timeStamp", new Long(j)));
            if (bool3 != null) {
                linkedHashMapK.put("sosSentSuccessfully", bool3);
            }
            AnalyticsContractImplKt.b(this.p, str6, Source.SOS_SCREEN, linkedHashMapK, false, 24);
            return Unit.f17538a;
        }
        return coroutineSingletons;
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        SosScreenComponent$convertToUiState$2 sosScreenComponent$convertToUiState$2 = new SosScreenComponent$convertToUiState$2(1, this, SosScreenComponent.class, "processIntent", "processIntent(Lapp/chalo/sos/SosScreenIntent;)V", 0);
        return this.o.a((SosScreenDataState) obj, sosScreenComponent$convertToUiState$2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        EmptyList emptyList = EmptyList.f17557a;
        return new SosScreenDataState("", emptyList, emptyList, null, SosScreenType.DISPLAY_SCREEN, false, null, false);
    }
}
