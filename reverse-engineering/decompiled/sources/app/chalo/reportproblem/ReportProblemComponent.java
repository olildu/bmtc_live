package app.chalo.reportproblem;

import app.chalo.analytics.contract.AnalyticsContract;
import app.chalo.features.chaloconfig.ChaloConfigFeature;
import app.chalo.features.network.NetworkConnectionType;
import app.chalo.features.network.NetworkStateManager;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.features.reportproblem.ReportProblemCollection;
import app.chalo.features.reportproblem.ReportProblemFeatureProblem;
import app.chalo.home.domain.AutoLinkDeviceIdUseCase;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.providers.stringprovider.StringEnum;
import app.chalo.providers.stringprovider.StringProvider;
import app.chalo.providers.toast.KotlinToastManager;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.ChaloNavigationManagerKt;
import app.chalo.scenes.args.ReportProblemArgs;
import app.chalo.uistate.dialog.DialogUIStateFactory;
import app.chalo.usecase.InitiateProductHistorySyncCallUseCase;
import app.chalo.userprofile.UserProfileAppModel;
import app.chalo.utils.SystemHelper;
import com.arkivanov.decompose.ComponentContext;
import defpackage.g11;
import defpackage.m21;
import defpackage.vw0;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.internal.ContextScope;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¨\u0006\u0006"}, d2 = {"Lapp/chalo/reportproblem/ReportProblemComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/reportproblem/ReportProblemIntent;", "Lapp/chalo/reportproblem/ReportProblemDataState;", "Lapp/chalo/reportproblem/ReportProblemViewState;", "Lapp/chalo/reportproblem/ReportProblemSideEffect;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReportProblemComponent extends ChaloBaseStateMviComponent<ReportProblemIntent, ReportProblemDataState, ReportProblemViewState, ReportProblemSideEffect> {
    public final IReportProblemFeature k;
    public final AutoLinkDeviceIdUseCase l;
    public final StringProvider m;
    public final ChaloNavigationManager n;
    public final KotlinToastManager o;
    public final AnalyticsContract p;
    public final InitiateProductHistorySyncCallUseCase q;
    public final ChaloConfigFeature r;
    public final UserProfileDetailsProvider s;
    public final SystemHelper t;
    public final NetworkStateManager u;
    public final InitiateFreshChatCustomerSupportUseCase v;

    /* JADX INFO: renamed from: app.chalo.reportproblem.ReportProblemComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.reportproblem.ReportProblemComponent$1", f = "ReportProblemComponent.kt", l = {}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: app.chalo.reportproblem.ReportProblemComponent$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "app.chalo.reportproblem.ReportProblemComponent$1$1", f = "ReportProblemComponent.kt", l = {EACTags.DISPLAY_IMAGE}, m = "invokeSuspend", v = 1)
        final class C01401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ ReportProblemComponent this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01401(ReportProblemComponent reportProblemComponent, Continuation continuation) {
                super(2, continuation);
                this.this$0 = reportProblemComponent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01401(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ((C01401) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    ResultKt.b(obj);
                    StateFlow stateFlowB = this.this$0.u.b();
                    final ReportProblemComponent reportProblemComponent = this.this$0;
                    FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.reportproblem.ReportProblemComponent.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj2, Continuation continuation) {
                            reportProblemComponent.K0(new ReportProblemIntent.InternetConnectionIntent((NetworkConnectionType) obj2));
                            return Unit.f17538a;
                        }
                    };
                    this.label = 1;
                    if (stateFlowB.collect(flowCollector, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return ReportProblemComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2);
            Unit unit = Unit.f17538a;
            anonymousClass1.invokeSuspend(unit);
            return unit;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            ReportProblemComponent reportProblemComponent = ReportProblemComponent.this;
            reportProblemComponent.D0(new C01401(reportProblemComponent, null));
            return Unit.f17538a;
        }
    }

    public ReportProblemComponent(ComponentContext componentContext, ReportProblemArgs reportProblemArgs, IReportProblemFeature iReportProblemFeature, AutoLinkDeviceIdUseCase autoLinkDeviceIdUseCase, StringProvider stringProvider, ChaloNavigationManager chaloNavigationManager, KotlinToastManager kotlinToastManager, AnalyticsContract analyticsContract, InitiateProductHistorySyncCallUseCase initiateProductHistorySyncCallUseCase, ChaloConfigFeature chaloConfigFeature, UserProfileDetailsProvider userProfileDetailsProvider, SystemHelper systemHelper, NetworkStateManager networkStateManager, InitiateFreshChatCustomerSupportUseCase initiateFreshChatCustomerSupportUseCase) {
        super(componentContext);
        this.k = iReportProblemFeature;
        this.l = autoLinkDeviceIdUseCase;
        this.m = stringProvider;
        this.n = chaloNavigationManager;
        this.o = kotlinToastManager;
        this.p = analyticsContract;
        this.q = initiateProductHistorySyncCallUseCase;
        this.r = chaloConfigFeature;
        this.s = userProfileDetailsProvider;
        this.t = systemHelper;
        this.u = networkStateManager;
        this.v = initiateFreshChatCustomerSupportUseCase;
        K0(new ReportProblemIntent.InitFreshChat(reportProblemArgs));
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008f, code lost:
    
        if (r11 == r2) goto L30;
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F0(app.chalo.reportproblem.ReportProblemComponent r10, kotlin.coroutines.jvm.internal.ContinuationImpl r11) {
        /*
            app.chalo.providers.stringprovider.StringProvider r0 = r10.m
            boolean r1 = r11 instanceof app.chalo.reportproblem.ReportProblemComponent$reclaimMagicPassesHandler$1
            if (r1 == 0) goto L15
            r1 = r11
            app.chalo.reportproblem.ReportProblemComponent$reclaimMagicPassesHandler$1 r1 = (app.chalo.reportproblem.ReportProblemComponent$reclaimMagicPassesHandler$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            app.chalo.reportproblem.ReportProblemComponent$reclaimMagicPassesHandler$1 r1 = new app.chalo.reportproblem.ReportProblemComponent$reclaimMagicPassesHandler$1
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r1.label
            r4 = 3
            r5 = 1
            r6 = 0
            r7 = 2
            r8 = 0
            if (r3 == 0) goto L4d
            if (r3 == r5) goto L49
            if (r3 == r7) goto L3d
            if (r3 != r4) goto L35
            java.lang.Object r10 = r1.L$0
            app.chalo.providers.toast.KotlinToastManager r10 = (app.chalo.providers.toast.KotlinToastManager) r10
            kotlin.ResultKt.b(r11)
            goto L92
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3d:
            java.lang.Object r10 = r1.L$1
            app.chalo.scenes.ChaloNavigationManager r10 = (app.chalo.scenes.ChaloNavigationManager) r10
            java.lang.Object r0 = r1.L$0
            java.lang.String r0 = (java.lang.String) r0
            kotlin.ResultKt.b(r11)
            goto L73
        L49:
            kotlin.ResultKt.b(r11)
            goto L59
        L4d:
            kotlin.ResultKt.b(r11)
            r1.label = r5
            java.lang.Object r11 = r10.H0(r1)
            if (r11 != r2) goto L59
            goto L91
        L59:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L7f
            app.chalo.scenes.ChaloNavigationManager r10 = r10.n
            app.chalo.providers.stringprovider.StringEnum r3 = app.chalo.providers.stringprovider.StringEnum.APP_NAME
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r1.L$0 = r11
            r1.L$1 = r10
            r1.label = r7
            java.lang.Object r0 = r0.b(r3, r4, r1)
            if (r0 != r2) goto L70
            goto L91
        L70:
            r9 = r0
            r0 = r11
            r11 = r9
        L73:
            java.lang.String r11 = (java.lang.String) r11
            app.chalo.scenes.args.WebViewArgs r1 = new app.chalo.scenes.args.WebViewArgs
            r1.<init>(r0, r11, r8, r8)
            r11 = 6
            app.chalo.scenes.ChaloNavigationManagerKt.e(r10, r1, r6, r11)
            goto L97
        L7f:
            app.chalo.providers.toast.KotlinToastManager r10 = r10.o
            app.chalo.providers.stringprovider.StringEnum r11 = app.chalo.providers.stringprovider.StringEnum.SOMETHING_WENT_WRONG
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r1.L$0 = r10
            r1.L$1 = r6
            r1.label = r4
            java.lang.Object r11 = r0.b(r11, r3, r1)
            if (r11 != r2) goto L92
        L91:
            return r2
        L92:
            java.lang.String r11 = (java.lang.String) r11
            app.chalo.providers.toast.KotlinToastManagerKt.b(r10, r11)
        L97:
            kotlin.Unit r10 = kotlin.Unit.f17538a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.reportproblem.ReportProblemComponent.F0(app.chalo.reportproblem.ReportProblemComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:42:0x015c  */
    /* JADX WARN: Code duplicated, block: B:44:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0249  */
    /* JADX WARN: Code duplicated, block: B:64:0x024f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0262  */
    /* JADX WARN: Code duplicated, block: B:69:0x026d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0275  */
    /* JADX WARN: Code duplicated, block: B:76:0x028c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0291  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:86:0x02d5  */
    /* JADX WARN: Code duplicated, block: B:89:0x02f4  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (r2 == r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0286, code lost:
    
        if (r2 == r4) goto L85;
     */
    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    /* JADX INFO: renamed from: G0, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object p0(app.chalo.reportproblem.ReportProblemDataState r42, kotlin.coroutines.jvm.internal.ContinuationImpl r43) {
        /*
            Method dump skipped, instruction units count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.reportproblem.ReportProblemComponent.p0(app.chalo.reportproblem.ReportProblemDataState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H0(ContinuationImpl continuationImpl) {
        ReportProblemComponent$getReclaimWebLinkUri$1 reportProblemComponent$getReclaimWebLinkUri$1;
        String strA;
        StringBuilder sb;
        StringBuilder sb2;
        if (continuationImpl instanceof ReportProblemComponent$getReclaimWebLinkUri$1) {
            reportProblemComponent$getReclaimWebLinkUri$1 = (ReportProblemComponent$getReclaimWebLinkUri$1) continuationImpl;
            int i = reportProblemComponent$getReclaimWebLinkUri$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemComponent$getReclaimWebLinkUri$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemComponent$getReclaimWebLinkUri$1 = new ReportProblemComponent$getReclaimWebLinkUri$1(this, continuationImpl);
            }
        } else {
            reportProblemComponent$getReclaimWebLinkUri$1 = new ReportProblemComponent$getReclaimWebLinkUri$1(this, continuationImpl);
        }
        Object obj = reportProblemComponent$getReclaimWebLinkUri$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemComponent$getReclaimWebLinkUri$1.label;
        UserProfileDetailsProvider userProfileDetailsProvider = this.s;
        if (i2 == 0) {
            ResultKt.b(obj);
            StringBuilder sb3 = new StringBuilder();
            UserProfileAppModel userProfileAppModelF = userProfileDetailsProvider.f();
            strA = userProfileAppModelF != null ? userProfileAppModelF.a() : null;
            if (strA == null) {
                return null;
            }
            reportProblemComponent$getReclaimWebLinkUri$1.L$0 = sb3;
            reportProblemComponent$getReclaimWebLinkUri$1.L$1 = strA;
            reportProblemComponent$getReclaimWebLinkUri$1.L$2 = sb3;
            reportProblemComponent$getReclaimWebLinkUri$1.label = 1;
            Object objA = this.r.a("reclaimPassesRequestUrl", reportProblemComponent$getReclaimWebLinkUri$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
            sb = sb3;
            obj = objA;
            sb2 = sb;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sb = (StringBuilder) reportProblemComponent$getReclaimWebLinkUri$1.L$2;
            strA = (String) reportProblemComponent$getReclaimWebLinkUri$1.L$1;
            sb2 = (StringBuilder) reportProblemComponent$getReclaimWebLinkUri$1.L$0;
            ResultKt.b(obj);
        }
        String str = (String) obj;
        int length = str.length() - 1;
        int i3 = 0;
        boolean z = false;
        while (i3 <= length) {
            boolean z2 = Intrinsics.k(str.charAt(!z ? i3 : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i3++;
            } else {
                z = true;
            }
        }
        sb.append(str.subSequence(i3, length + 1).toString());
        sb2.append("?entry.1987039175=" + strA);
        UserProfileAppModel userProfileAppModelF2 = userProfileDetailsProvider.f();
        sb2.append("&entry.58353678=" + (userProfileAppModelF2 != null ? userProfileAppModelF2.e : null));
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I0(ContinuationImpl continuationImpl) {
        ReportProblemComponent$makeReclaimRequestDialogUiState$1 reportProblemComponent$makeReclaimRequestDialogUiState$1;
        DialogUIStateFactory dialogUIStateFactory;
        String str;
        String str2;
        Object objB;
        String str3;
        DialogUIStateFactory dialogUIStateFactory2;
        String str4;
        if (continuationImpl instanceof ReportProblemComponent$makeReclaimRequestDialogUiState$1) {
            reportProblemComponent$makeReclaimRequestDialogUiState$1 = (ReportProblemComponent$makeReclaimRequestDialogUiState$1) continuationImpl;
            int i = reportProblemComponent$makeReclaimRequestDialogUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemComponent$makeReclaimRequestDialogUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemComponent$makeReclaimRequestDialogUiState$1 = new ReportProblemComponent$makeReclaimRequestDialogUiState$1(this, continuationImpl);
            }
        } else {
            reportProblemComponent$makeReclaimRequestDialogUiState$1 = new ReportProblemComponent$makeReclaimRequestDialogUiState$1(this, continuationImpl);
        }
        Object objB2 = reportProblemComponent$makeReclaimRequestDialogUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemComponent$makeReclaimRequestDialogUiState$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(objB2);
            DialogUIStateFactory dialogUIStateFactory3 = DialogUIStateFactory.f9989a;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0 = dialogUIStateFactory3;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.label = 1;
            objB2 = stringProvider.b(StringEnum.DIALOG_MESSAGE_CONFIRM_RECLAIM_PASS, new Object[0], reportProblemComponent$makeReclaimRequestDialogUiState$1);
            if (objB2 != coroutineSingletons) {
                dialogUIStateFactory = dialogUIStateFactory3;
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            dialogUIStateFactory = (DialogUIStateFactory) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0;
            ResultKt.b(objB2);
        } else {
            if (i2 == 2) {
                String str5 = (String) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$1;
                DialogUIStateFactory dialogUIStateFactory4 = (DialogUIStateFactory) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0;
                ResultKt.b(objB2);
                str = str5;
                dialogUIStateFactory = dialogUIStateFactory4;
                str2 = (String) objB2;
                reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0 = dialogUIStateFactory;
                reportProblemComponent$makeReclaimRequestDialogUiState$1.L$1 = str;
                reportProblemComponent$makeReclaimRequestDialogUiState$1.L$2 = str2;
                reportProblemComponent$makeReclaimRequestDialogUiState$1.label = 3;
                objB = stringProvider.b(StringEnum.NO, new Object[0], reportProblemComponent$makeReclaimRequestDialogUiState$1);
                if (objB != coroutineSingletons) {
                    str3 = str2;
                    objB2 = objB;
                    dialogUIStateFactory2 = dialogUIStateFactory;
                    str4 = str;
                }
                return coroutineSingletons;
            }
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str6 = (String) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$2;
            str4 = (String) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$1;
            dialogUIStateFactory2 = (DialogUIStateFactory) reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0;
            ResultKt.b(objB2);
            str3 = str6;
        }
        String str7 = (String) objB2;
        m21 m21Var = new m21(this, 0);
        m21 m21Var2 = new m21(this, 1);
        dialogUIStateFactory2.getClass();
        return DialogUIStateFactory.b(null, str4, str3, str7, m21Var, m21Var2);
        String str8 = (String) objB2;
        reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0 = dialogUIStateFactory;
        reportProblemComponent$makeReclaimRequestDialogUiState$1.L$1 = str8;
        reportProblemComponent$makeReclaimRequestDialogUiState$1.label = 2;
        Object objB3 = stringProvider.b(StringEnum.YES, new Object[0], reportProblemComponent$makeReclaimRequestDialogUiState$1);
        if (objB3 != coroutineSingletons) {
            str = str8;
            objB2 = objB3;
            str2 = (String) objB2;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.L$0 = dialogUIStateFactory;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.L$1 = str;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.L$2 = str2;
            reportProblemComponent$makeReclaimRequestDialogUiState$1.label = 3;
            objB = stringProvider.b(StringEnum.NO, new Object[0], reportProblemComponent$makeReclaimRequestDialogUiState$1);
            if (objB != coroutineSingletons) {
                str3 = str2;
                objB2 = objB;
                dialogUIStateFactory2 = dialogUIStateFactory;
                str4 = str;
                String str9 = (String) objB2;
                m21 m21Var3 = new m21(this, 0);
                m21 m21Var4 = new m21(this, 1);
                dialogUIStateFactory2.getClass();
                return DialogUIStateFactory.b(null, str4, str3, str9, m21Var3, m21Var4);
            }
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object J0(ContinuationImpl continuationImpl) {
        ReportProblemComponent$makeReclaimResponseDialogUiState$1 reportProblemComponent$makeReclaimResponseDialogUiState$1;
        DialogUIStateFactory dialogUIStateFactory;
        String str;
        Object objB;
        String str2;
        DialogUIStateFactory dialogUIStateFactory2;
        String str3;
        Object objB2;
        String str4;
        String str5;
        Object objB3;
        String str6;
        DialogUIStateFactory dialogUIStateFactory3;
        String str7;
        if (continuationImpl instanceof ReportProblemComponent$makeReclaimResponseDialogUiState$1) {
            reportProblemComponent$makeReclaimResponseDialogUiState$1 = (ReportProblemComponent$makeReclaimResponseDialogUiState$1) continuationImpl;
            int i = reportProblemComponent$makeReclaimResponseDialogUiState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                reportProblemComponent$makeReclaimResponseDialogUiState$1.label = i - Integer.MIN_VALUE;
            } else {
                reportProblemComponent$makeReclaimResponseDialogUiState$1 = new ReportProblemComponent$makeReclaimResponseDialogUiState$1(this, continuationImpl);
            }
        } else {
            reportProblemComponent$makeReclaimResponseDialogUiState$1 = new ReportProblemComponent$makeReclaimResponseDialogUiState$1(this, continuationImpl);
        }
        Object objB4 = reportProblemComponent$makeReclaimResponseDialogUiState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = reportProblemComponent$makeReclaimResponseDialogUiState$1.label;
        StringProvider stringProvider = this.m;
        if (i2 == 0) {
            ResultKt.b(objB4);
            boolean z = ((ReportProblemDataState) this.f.getValue()).h;
            dialogUIStateFactory = DialogUIStateFactory.f9989a;
            if (z) {
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 1;
                objB4 = stringProvider.b(StringEnum.DIALOG_MESSAGE_RECLAIM_PASS_SUCCESSFUL, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                if (objB4 != coroutineSingletons) {
                    str = (String) objB4;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 2;
                    objB = stringProvider.b(StringEnum.OKAY, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                    if (objB != coroutineSingletons) {
                        DialogUIStateFactory dialogUIStateFactory4 = dialogUIStateFactory;
                        str2 = str;
                        objB4 = objB;
                        dialogUIStateFactory2 = dialogUIStateFactory4;
                        String str8 = (String) objB4;
                        m21 m21Var = new m21(this, 4);
                        dialogUIStateFactory2.getClass();
                        return DialogUIStateFactory.b(null, str2, str8, null, m21Var, null);
                    }
                }
            } else {
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 3;
                objB4 = stringProvider.b(StringEnum.DIALOG_MESSAGE_RECLAIM_PASS_NOT_SUCCESSFUL, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                if (objB4 != coroutineSingletons) {
                    str3 = (String) objB4;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str3;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 4;
                    objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                    if (objB2 != coroutineSingletons) {
                        str4 = str3;
                        objB4 = objB2;
                        str5 = (String) objB4;
                        reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                        reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str4;
                        reportProblemComponent$makeReclaimResponseDialogUiState$1.L$2 = str5;
                        reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 5;
                        objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                        if (objB3 != coroutineSingletons) {
                            str6 = str5;
                            objB4 = objB3;
                            dialogUIStateFactory3 = dialogUIStateFactory;
                            str7 = str4;
                            String str9 = (String) objB4;
                            m21 m21Var2 = new m21(this, 5);
                            m21 m21Var3 = new m21(this, 6);
                            dialogUIStateFactory3.getClass();
                            return DialogUIStateFactory.b(null, str7, str6, str9, m21Var2, m21Var3);
                        }
                    }
                }
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            dialogUIStateFactory = (DialogUIStateFactory) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0;
            ResultKt.b(objB4);
            str = (String) objB4;
            reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
            reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str;
            reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 2;
            objB = stringProvider.b(StringEnum.OKAY, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
            if (objB != coroutineSingletons) {
                DialogUIStateFactory dialogUIStateFactory5 = dialogUIStateFactory;
                str2 = str;
                objB4 = objB;
                dialogUIStateFactory2 = dialogUIStateFactory5;
            }
            return coroutineSingletons;
        }
        if (i2 != 2) {
            if (i2 == 3) {
                dialogUIStateFactory = (DialogUIStateFactory) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0;
                ResultKt.b(objB4);
                str3 = (String) objB4;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str3;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 4;
                objB2 = stringProvider.b(StringEnum.CONTINUE, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                if (objB2 != coroutineSingletons) {
                    str4 = str3;
                    objB4 = objB2;
                    str5 = (String) objB4;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str4;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.L$2 = str5;
                    reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 5;
                    objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                    if (objB3 != coroutineSingletons) {
                        str6 = str5;
                        objB4 = objB3;
                        dialogUIStateFactory3 = dialogUIStateFactory;
                        str7 = str4;
                    }
                }
                return coroutineSingletons;
            }
            if (i2 == 4) {
                String str10 = (String) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1;
                DialogUIStateFactory dialogUIStateFactory6 = (DialogUIStateFactory) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0;
                ResultKt.b(objB4);
                str4 = str10;
                dialogUIStateFactory = dialogUIStateFactory6;
                str5 = (String) objB4;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0 = dialogUIStateFactory;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1 = str4;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.L$2 = str5;
                reportProblemComponent$makeReclaimResponseDialogUiState$1.label = 5;
                objB3 = stringProvider.b(StringEnum.CANCEL, new Object[0], reportProblemComponent$makeReclaimResponseDialogUiState$1);
                if (objB3 != coroutineSingletons) {
                    str6 = str5;
                    objB4 = objB3;
                    dialogUIStateFactory3 = dialogUIStateFactory;
                    str7 = str4;
                }
                return coroutineSingletons;
            }
            if (i2 != 5) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str11 = (String) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$2;
            str7 = (String) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1;
            dialogUIStateFactory3 = (DialogUIStateFactory) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0;
            ResultKt.b(objB4);
            str6 = str11;
            String str12 = (String) objB4;
            m21 m21Var4 = new m21(this, 5);
            m21 m21Var5 = new m21(this, 6);
            dialogUIStateFactory3.getClass();
            return DialogUIStateFactory.b(null, str7, str6, str12, m21Var4, m21Var5);
        }
        String str13 = (String) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$1;
        dialogUIStateFactory2 = (DialogUIStateFactory) reportProblemComponent$makeReclaimResponseDialogUiState$1.L$0;
        ResultKt.b(objB4);
        str2 = str13;
        String str14 = (String) objB4;
        m21 m21Var6 = new m21(this, 4);
        dialogUIStateFactory2.getClass();
        return DialogUIStateFactory.b(null, str2, str14, null, m21Var6, null);
    }

    public final void K0(ReportProblemIntent reportProblemIntent) {
        C0(reportProblemIntent);
        boolean z = reportProblemIntent instanceof ReportProblemIntent.InitFreshChat;
        ChaloNavigationManager chaloNavigationManager = this.n;
        if (z) {
            ReportProblemArgs reportProblemArgs = ((ReportProblemIntent.InitFreshChat) reportProblemIntent).f9020a;
            if (reportProblemArgs.b == null) {
                ChaloNavigationManagerKt.c(chaloNavigationManager);
                return;
            } else {
                E0(new vw0(reportProblemArgs, 24));
                return;
            }
        }
        if (reportProblemIntent instanceof ReportProblemIntent.ProblemItemClicked) {
            ReportProblemFeatureProblem reportProblemFeatureProblem = ((ReportProblemIntent.ProblemItemClicked) reportProblemIntent).f9023a;
            String str = reportProblemFeatureProblem.e;
            if (StringsKt.x(str, "article", true) || StringsKt.x(str, "category", true) || StringsKt.x(str, "chat", true)) {
                StateFlow stateFlow = this.f;
                ReportProblemCollection reportProblemCollection = ((ReportProblemDataState) stateFlow.getValue()).b;
                this.v.a(reportProblemCollection != null ? reportProblemCollection.b : null, reportProblemFeatureProblem.d.length() > 0, reportProblemFeatureProblem, ((ReportProblemDataState) stateFlow.getValue()).c);
            } else if (StringsKt.x(str, "reclaimPasses", true)) {
                AnalyticsContract.DefaultImpls.a(this.p, "reclaim pass", "ReportProblemFeature", null, null, false, 28);
                E0(new g11(15));
            }
            this.k.e(reportProblemFeatureProblem.f2762a, reportProblemFeatureProblem.b, str);
            return;
        }
        if (reportProblemIntent.equals(ReportProblemIntent.ReclaimRequestDialogNegativeBtnClicked.f9024a)) {
            E0(new g11(12));
            return;
        }
        boolean zEquals = reportProblemIntent.equals(ReportProblemIntent.ReclaimRequestDialogPositiveBtnClicked.f9025a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            E0(new g11(17));
            BuildersKt.d(contextScope, null, null, new ReportProblemComponent$handleReclaimRequestDialogPositiveBtnClicked$2(this, null), 3);
            return;
        }
        if (reportProblemIntent.equals(ReportProblemIntent.ReclaimResponseDialogNegativeBtnClicked.f9026a)) {
            E0(new g11(16));
            return;
        }
        if (reportProblemIntent.equals(ReportProblemIntent.ReclaimResponseDialogPositiveBtnClickedWithAutoLink.f9027a)) {
            E0(new g11(14));
            ChaloNavigationManagerKt.c(chaloNavigationManager);
            return;
        }
        if (reportProblemIntent.equals(ReportProblemIntent.ReclaimResponseDialogPositiveBtnClickedWithoutAutoLink.f9028a)) {
            BuildersKt.d(contextScope, null, null, new ReportProblemComponent$handleReclaimResponseDialogPositiveBtnClickedWithoutAutoLink$1(this, null), 3);
            return;
        }
        if (reportProblemIntent instanceof ReportProblemIntent.ContactSupportClicked) {
            this.t.d(((ReportProblemIntent.ContactSupportClicked) reportProblemIntent).f9019a);
        } else if (reportProblemIntent.equals(ReportProblemIntent.OnBackPressed.f9022a)) {
            ChaloNavigationManagerKt.c(chaloNavigationManager);
        } else {
            if (!(reportProblemIntent instanceof ReportProblemIntent.InternetConnectionIntent)) {
                throw new NoWhenBranchMatchedException();
            }
            E0(new vw0((ReportProblemIntent.InternetConnectionIntent) reportProblemIntent, 25));
        }
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new ReportProblemDataState(false, null, new LinkedHashMap(), null, null, false, false, false, false);
    }
}
