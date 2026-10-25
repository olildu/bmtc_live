package app.chalo.appmigrationpreconditions;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent;
import app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator;
import app.chalo.helper.MandatoryFirstHistoryCallGuard;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.resultstatemanager.userconsent.UserConsentResultStateManager;
import app.chalo.scenes.ChaloNavOptions;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationRequest;
import app.chalo.scenes.PopUpToConfig;
import app.chalo.scenes.args.AppMigrationPreconditionsArgs;
import app.chalo.scenes.args.CityDiscontinuedArgs;
import app.chalo.scenes.args.CitySelectionArgs;
import app.chalo.scenes.args.LoginOptionsArgs;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.l3;
import defpackage.s6;
import defpackage.v5;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.internal.ContextScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsIntent;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsDataState;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsUIState;", "Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsEffect;", "Companion", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppMigrationPreconditionsComponent extends ChaloBaseStateMviComponent<AppMigrationPreconditionsIntent, AppMigrationPreconditionsDataState, AppMigrationPreconditionsUIState, AppMigrationPreconditionsEffect> {
    public final MigrationFlowOrchestrator k;
    public final MandatoryFirstHistoryCallGuard l;
    public final ChaloNavigationManager m;
    public final StringProvider n;
    public final AnalyticsContract o;
    public final SystemHelper p;
    public final UserConsentResultStateManager q;
    public Job r;
    public Job s;

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lapp/chalo/appmigrationpreconditions/AppMigrationPreconditionsComponent$Companion;", "", "", "TAG", "Ljava/lang/String;", "", "MIN_TIME_TO_SHOW_LOADER", "J", "MAX_TIME_TO_SHOW_LOADER", "", "RETRY_ATTEMPT_BACKOFF_FACTOR", "I", "MAX_RETRY_ATTEMPT", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppMigrationPreconditionsComponent(AppMigrationPreconditionsArgs args, ComponentContext componentContext, MigrationFlowOrchestrator migrationFlowOrchestrator, MandatoryFirstHistoryCallGuard mandatoryFirstHistoryCallGuard, ChaloNavigationManager chaloNavigationManager, StringProvider stringProvider, AnalyticsContract analyticsContract, SystemHelper systemHelper, UserConsentResultStateManager userConsentResultStateManager) {
        super(componentContext);
        Intrinsics.i(args, "args");
        Intrinsics.i(componentContext, "componentContext");
        this.k = migrationFlowOrchestrator;
        this.l = mandatoryFirstHistoryCallGuard;
        this.m = chaloNavigationManager;
        this.n = stringProvider;
        this.o = analyticsContract;
        this.p = systemHelper;
        this.q = userConsentResultStateManager;
        J0(AppMigrationPreconditionsIntent.InitialisationIntent.f956a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        if (r1 == r3) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent r16, long r17, int r19, kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            r0 = r16
            r1 = r20
            r0.getClass()
            boolean r2 = r1 instanceof app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$processMigrationSuccess$1
            if (r2 == 0) goto L1a
            r2 = r1
            app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$processMigrationSuccess$1 r2 = (app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$processMigrationSuccess$1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.label = r3
            goto L1f
        L1a:
            app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$processMigrationSuccess$1 r2 = new app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent$processMigrationSuccess$1
            r2.<init>(r0, r1)
        L1f:
            java.lang.Object r1 = r2.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r3 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r4 = r2.label
            r5 = 3
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L49
            if (r4 == r7) goto L41
            if (r4 == r6) goto L3d
            if (r4 != r5) goto L35
            kotlin.ResultKt.b(r1)
            goto Lb5
        L35:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3d:
            kotlin.ResultKt.b(r1)
            goto La8
        L41:
            int r4 = r2.I$0
            long r8 = r2.J$0
            kotlin.ResultKt.b(r1)
            goto L5f
        L49:
            kotlin.ResultKt.b(r1)
            app.chalo.helper.MandatoryFirstHistoryCallGuard r1 = r0.l
            r8 = r17
            r2.J$0 = r8
            r4 = r19
            r2.I$0 = r4
            r2.label = r7
            java.lang.Object r1 = r1.b(r2)
            if (r1 != r3) goto L5f
            goto Lb4
        L5f:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            r1.getClass()
            app.chalo.analytics.contract.AnalyticsContract r10 = r0.o
            app.chalo.constants.Source r12 = app.chalo.constants.Source.APP_MIGRATION_PRECONDITION_SCREEN
            kotlin.Pair r11 = new kotlin.Pair
            java.lang.String r13 = "requireHistoryCall"
            r11.<init>(r13, r1)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r4)
            kotlin.Pair r4 = new kotlin.Pair
            java.lang.String r13 = "attempt"
            r4.<init>(r13, r1)
            kotlin.Pair[] r1 = new kotlin.Pair[r6]
            r13 = 0
            r1[r13] = r11
            r1[r7] = r4
            java.util.Map r13 = kotlin.collections.MapsKt.i(r1)
            r14 = 0
            r15 = 24
            java.lang.String r11 = "app migration history call success"
            app.chalo.analytics.AnalyticsContractImplKt.b(r10, r11, r12, r13, r14, r15)
            app.chalo.utils.SystemHelper r1 = r0.p
            long r10 = r1.j()
            long r10 = r10 - r8
            r7 = 3000(0xbb8, double:1.482E-320)
            long r7 = r7 - r10
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto La8
            r2.label = r6
            java.lang.Object r1 = kotlinx.coroutines.DelayKt.b(r7, r2)
            if (r1 != r3) goto La8
            goto Lb4
        La8:
            app.chalo.appmigrationpreconditions.orchestrator.MigrationFlowOrchestrator r1 = r0.k
            app.chalo.constants.Source$Companion r4 = app.chalo.constants.Source.INSTANCE
            r2.label = r5
            java.lang.Object r1 = r1.b()
            if (r1 != r3) goto Lb5
        Lb4:
            return r3
        Lb5:
            app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision r1 = (app.chalo.onboarding.splash.orchestrator.SplashNavigationDecision) r1
            v5 r2 = new v5
            r3 = 5
            r2.<init>(r3)
            r0.E0(r2)
            r0.I0(r1)
            kotlin.Unit r0 = kotlin.Unit.f17538a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent.F0(app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent, long, int, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final void G0(AppMigrationPreconditionsComponent appMigrationPreconditionsComponent) {
        appMigrationPreconditionsComponent.E0(new v5(6));
        Job job = appMigrationPreconditionsComponent.r;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        appMigrationPreconditionsComponent.r = BuildersKt.d(appMigrationPreconditionsComponent.j, null, null, new AppMigrationPreconditionsComponent$startMigration$2(appMigrationPreconditionsComponent, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0149  */
    /* JADX WARN: Code duplicated, block: B:40:0x0160  */
    /* JADX WARN: Code duplicated, block: B:42:0x019c  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:46:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:49:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:53:0x020c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0219  */
    /* JADX WARN: Code duplicated, block: B:59:0x0232  */
    /* JADX WARN: Code duplicated, block: B:61:0x025f  */
    /* JADX WARN: Code duplicated, block: B:64:0x0266  */
    /* JADX WARN: Code duplicated, block: B:67:0x0284  */
    /* JADX WARN: Code duplicated, block: B:70:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0104, code lost:
    
        if (r5 == r4) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01df, code lost:
    
        if (r12 == r4) goto L66;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.appmigrationpreconditions.AppMigrationPreconditionsDataState r40, kotlin.coroutines.jvm.internal.ContinuationImpl r41) {
        /*
            Method dump skipped, instruction units count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.appmigrationpreconditions.AppMigrationPreconditionsComponent.p0(app.chalo.appmigrationpreconditions.AppMigrationPreconditionsDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final void I0(final SplashNavigationDecision splashNavigationDecision) {
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToLogin) {
            final int i = 0;
            q0(new Function0(this) { // from class: t6
                public final /* synthetic */ AppMigrationPreconditionsComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i) {
                        case 0:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToUserConsent) {
            String str = ((SplashNavigationDecision.ToUserConsent) splashNavigationDecision).f6689a;
            Job job = this.s;
            if (job != null) {
                ((JobSupport) job).cancel(null);
            }
            this.s = BuildersKt.d(this.j, null, null, new AppMigrationPreconditionsComponent$navigateToUserConsentScreen$1(this, str, null), 3);
            q0(new l3(7, this, str));
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToCitySelection) {
            final int i2 = 1;
            q0(new Function0(this) { // from class: t6
                public final /* synthetic */ AppMigrationPreconditionsComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i2) {
                        case 0:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (splashNavigationDecision instanceof SplashNavigationDecision.ToCityDiscontinued) {
            final int i3 = 2;
            q0(new Function0(this) { // from class: t6
                public final /* synthetic */ AppMigrationPreconditionsComponent b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    switch (i3) {
                        case 0:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new LoginOptionsArgs(((SplashNavigationDecision.ToLogin) splashNavigationDecision).f6687a, true), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        case 1:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(CitySelectionArgs.Companion.a(CitySelectionArgs.INSTANCE, ((SplashNavigationDecision.ToCitySelection) splashNavigationDecision).f6684a, null, 6), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                        default:
                            this.b.m.b(new ChaloNavigationRequest.Navigate(new CityDiscontinuedArgs(((SplashNavigationDecision.ToCityDiscontinued) splashNavigationDecision).f6683a), new ChaloNavOptions(new PopUpToConfig.ClearAll(), 3), null, 4));
                            break;
                    }
                    return Unit.f17538a;
                }
            });
            return;
        }
        if (Intrinsics.d(splashNavigationDecision, SplashNavigationDecision.ToMigrationScreen.f6688a)) {
            q0(new s6(this, 1));
            return;
        }
        if (Intrinsics.d(splashNavigationDecision, SplashNavigationDecision.ToHomeScreen.f6685a)) {
            AnalyticsContract.DefaultImpls.a(this.o, "new home screen rendered", "", null, null, false, 28);
            AnalyticsContract.DefaultImpls.a(this.o, "tab based homescreen rendered", "", null, null, false, 28);
            q0(new s6(this, 3));
        } else {
            if (!Intrinsics.d(splashNavigationDecision, SplashNavigationDecision.ToLanguageSelection.f6686a)) {
                throw new NoWhenBranchMatchedException();
            }
            q0(new s6(this, 2));
        }
    }

    public final void J0(AppMigrationPreconditionsIntent appMigrationPreconditionsIntent) {
        C0(appMigrationPreconditionsIntent);
        boolean zEquals = appMigrationPreconditionsIntent.equals(AppMigrationPreconditionsIntent.InitialisationIntent.f956a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new AppMigrationPreconditionsComponent$handleInitialisationIntent$1(this, null), 3);
        } else if (appMigrationPreconditionsIntent.equals(AppMigrationPreconditionsIntent.RetryClickedIntent.f957a)) {
            BuildersKt.d(contextScope, null, null, new AppMigrationPreconditionsComponent$handleRetryClickedIntent$1(this, null), 3);
        } else if (!appMigrationPreconditionsIntent.equals(AppMigrationPreconditionsIntent.BackClickedIntent.f955a)) {
            throw new NoWhenBranchMatchedException();
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new AppMigrationPreconditionsDataState(true, false);
    }
}
