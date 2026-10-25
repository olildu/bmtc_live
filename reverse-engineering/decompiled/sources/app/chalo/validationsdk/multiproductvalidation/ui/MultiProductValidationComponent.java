package app.chalo.validationsdk.multiproductvalidation.ui;

import app.chalo.constants.Source;
import app.chalo.contract.BasicInfoContract;
import app.chalo.features.reportproblem.IReportProblemFeature;
import app.chalo.mvibase.simple.ChaloBaseStateMviComponent;
import app.chalo.notification.core.GCMReceiver;
import app.chalo.notification.core.GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1;
import app.chalo.notification.models.AppNotification;
import app.chalo.permissions.handler.PermissionHandlerProvider;
import app.chalo.scenes.ChaloNavigationManager;
import app.chalo.scenes.args.ValidationArgs;
import app.chalo.uistate.toolbar.ToolbarUIState;
import app.chalo.usecase.IsNotificationPermissionGrantedUseCase;
import app.chalo.validationsdk.blevalidation.config.ChildValidationDelegate;
import app.chalo.validationsdk.blevalidation.config.MultiProductValidationConfig;
import app.chalo.validationsdk.blevalidation.config.ProductValidationAnalyticManager;
import app.chalo.validationsdk.blevalidation.config.ProductValidationConfigProvider;
import app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData;
import app.chalo.validationsdk.blevalidation.data.models.ProductValidationData;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleDelegate;
import app.chalo.validationsdk.blevalidation.domain.qrvalidation.QRValidationLifecycleResult;
import com.arkivanov.decompose.ComponentContext;
import defpackage.dk0;
import defpackage.ej0;
import defpackage.lj0;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.sequences.FilteringSequence;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationComponent;", "Lapp/chalo/mvibase/simple/ChaloBaseStateMviComponent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationDataState;", "Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationUIState;", "", "Companion", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MultiProductValidationComponent extends ChaloBaseStateMviComponent<MultiProductValidationIntent, MultiProductValidationDataState, MultiProductValidationUIState, Unit> {
    public final ValidationArgs.MultiProductValidation k;
    public final BasicInfoContract l;
    public final ProductValidationConfigProvider m;
    public final QRValidationLifecycleDelegate n;
    public final GCMReceiver o;
    public final IReportProblemFeature p;
    public final ChaloNavigationManager q;
    public final IsNotificationPermissionGrantedUseCase r;
    public final PermissionHandlerProvider s;
    public final MultiProductValidationUIStateFactory t;
    public final Lazy u;
    public Job v;
    public Job w;
    public Job x;
    public long y;
    public final MutexImpl z;

    /* JADX INFO: renamed from: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent$1", f = "MultiProductValidationComponent.kt", l = {EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return MultiProductValidationComponent.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                ResultKt.b(obj);
                GCMReceiverImpl$receiveNotificationFor$$inlined$filter$1 gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C = MultiProductValidationComponent.this.o.c(Reflection.a(AppNotification.PunchNotification.class));
                final MultiProductValidationComponent multiProductValidationComponent = MultiProductValidationComponent.this;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        multiProductValidationComponent.O0(new MultiProductValidationIntent.PunchEventReceivedIntent((AppNotification.PunchNotification) obj2));
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (gCMReceiverImpl$receiveNotificationFor$$inlined$filter$1C.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            return Unit.f17538a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationComponent$Companion;", "", "", "VALIDITY_TICK_INTERVAL_MS", "J", "", "MULTI_PRODUCT_PUNCH_SOURCE", "Ljava/lang/String;", "validationsdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public MultiProductValidationComponent(ComponentContext componentContext, ValidationArgs.MultiProductValidation multiProductValidation, BasicInfoContract basicInfoContract, ProductValidationConfigProvider productValidationConfigProvider, QRValidationLifecycleDelegate qRValidationLifecycleDelegate, GCMReceiver gCMReceiver, IReportProblemFeature iReportProblemFeature, ChaloNavigationManager chaloNavigationManager, IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase, PermissionHandlerProvider permissionHandlerProvider, MultiProductValidationUIStateFactory multiProductValidationUIStateFactory) {
        super(componentContext);
        this.k = multiProductValidation;
        this.l = basicInfoContract;
        this.m = productValidationConfigProvider;
        this.n = qRValidationLifecycleDelegate;
        this.o = gCMReceiver;
        this.p = iReportProblemFeature;
        this.q = chaloNavigationManager;
        this.r = isNotificationPermissionGrantedUseCase;
        this.s = permissionHandlerProvider;
        this.t = multiProductValidationUIStateFactory;
        this.u = LazyKt.b(new dk0(this, 3));
        this.z = MutexKt.a();
        O0(MultiProductValidationIntent.InitializationIntent.f10695a);
        BuildersKt.d(this.j, null, null, new AnonymousClass1(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ff A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:16:0x0056, B:63:0x015c, B:57:0x012f, B:59:0x0135, B:64:0x0174, B:68:0x017c, B:23:0x0074, B:56:0x0111, B:26:0x0086, B:50:0x00f3, B:52:0x00ff, B:43:0x00d4, B:46:0x00e0), top: B:73:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:54:0x010f  */
    /* JADX WARN: Code duplicated, block: B:55:0x0110  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:16:0x0056, B:63:0x015c, B:57:0x012f, B:59:0x0135, B:64:0x0174, B:68:0x017c, B:23:0x0074, B:56:0x0111, B:26:0x0086, B:50:0x00f3, B:52:0x00ff, B:43:0x00d4, B:46:0x00e0), top: B:73:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174 A[Catch: all -> 0x005f, TryCatch #0 {all -> 0x005f, blocks: (B:16:0x0056, B:63:0x015c, B:57:0x012f, B:59:0x0135, B:64:0x0174, B:68:0x017c, B:23:0x0074, B:56:0x0111, B:26:0x0086, B:50:0x00f3, B:52:0x00ff, B:43:0x00d4, B:46:0x00e0), top: B:73:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:66:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0158 -> B:63:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object F0(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.F0(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public static final ProductValidationAnalyticManager G0(MultiProductValidationComponent multiProductValidationComponent) {
        return multiProductValidationComponent.M0().getB();
    }

    public static final Object H0(MultiProductValidationComponent multiProductValidationComponent, ProductValidationData productValidationData, MultiProductValidationData multiProductValidationData, String str, Continuation continuation) {
        Object objA;
        ChildValidationDelegate childValidationDelegateL0 = multiProductValidationComponent.L0(productValidationData);
        return (childValidationDelegateL0 != null && (objA = ProductValidationAnalyticManager.DefaultImpls.a(childValidationDelegateL0.c.getB(), str, childValidationDelegateL0.b, Source.MULTI_PRODUCT_VALIDATION_SCREEN.getSourceName(), MapsKt.i(new Pair("groupId", multiProductValidationData.getId()), new Pair("totalGroupChildren", new Integer(multiProductValidationData.G().size())), new Pair("bookingId", productValidationData.getId()), new Pair(PaymentConstants.ORDER_ID_CAMEL, productValidationData.getId()), new Pair("productType", productValidationData.a()), new Pair("productSubType", productValidationData.b()), new Pair("groupChildrenProducts", CollectionsKt.O(multiProductValidationData.G(), null, null, null, new lj0(8), 31))), continuation, 16)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? objA : Unit.f17538a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0091  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00ae -> B:27:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object I0(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent r11, app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData r12, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData r13, kotlin.coroutines.jvm.internal.ContinuationImpl r14) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent.I0(app.chalo.validationsdk.multiproductvalidation.ui.MultiProductValidationComponent, app.chalo.validationsdk.blevalidation.data.models.MultiProductValidationData, app.chalo.validationsdk.blevalidation.data.models.ProductValidationData, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object J0(MultiProductValidationComponent multiProductValidationComponent, ContinuationImpl continuationImpl) {
        MultiProductValidationComponent$requestNotificationPermissionIfRequired$1 multiProductValidationComponent$requestNotificationPermissionIfRequired$1;
        multiProductValidationComponent.getClass();
        if (continuationImpl instanceof MultiProductValidationComponent$requestNotificationPermissionIfRequired$1) {
            multiProductValidationComponent$requestNotificationPermissionIfRequired$1 = (MultiProductValidationComponent$requestNotificationPermissionIfRequired$1) continuationImpl;
            int i = multiProductValidationComponent$requestNotificationPermissionIfRequired$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationComponent$requestNotificationPermissionIfRequired$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationComponent$requestNotificationPermissionIfRequired$1 = new MultiProductValidationComponent$requestNotificationPermissionIfRequired$1(multiProductValidationComponent, continuationImpl);
            }
        } else {
            multiProductValidationComponent$requestNotificationPermissionIfRequired$1 = new MultiProductValidationComponent$requestNotificationPermissionIfRequired$1(multiProductValidationComponent, continuationImpl);
        }
        Object objA = multiProductValidationComponent$requestNotificationPermissionIfRequired$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationComponent$requestNotificationPermissionIfRequired$1.label;
        if (i2 == 0) {
            ResultKt.b(objA);
            IsNotificationPermissionGrantedUseCase isNotificationPermissionGrantedUseCase = multiProductValidationComponent.r;
            multiProductValidationComponent$requestNotificationPermissionIfRequired$1.label = 1;
            objA = isNotificationPermissionGrantedUseCase.a(multiProductValidationComponent$requestNotificationPermissionIfRequired$1);
            if (objA == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        Unit unit = Unit.f17538a;
        if (zBooleanValue) {
            return unit;
        }
        Job job = multiProductValidationComponent.x;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        multiProductValidationComponent.x = BuildersKt.d(multiProductValidationComponent.j, null, null, new MultiProductValidationComponent$requestNotificationPermissionIfRequired$2(multiProductValidationComponent, null), 3);
        return unit;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object K0(MultiProductValidationComponent multiProductValidationComponent, ProductValidationData productValidationData, QRValidationLifecycleResult qRValidationLifecycleResult, ContinuationImpl continuationImpl) {
        MultiProductValidationComponent$updateQrState$1 multiProductValidationComponent$updateQrState$1;
        Mutex mutex;
        multiProductValidationComponent.getClass();
        if (continuationImpl instanceof MultiProductValidationComponent$updateQrState$1) {
            multiProductValidationComponent$updateQrState$1 = (MultiProductValidationComponent$updateQrState$1) continuationImpl;
            int i = multiProductValidationComponent$updateQrState$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                multiProductValidationComponent$updateQrState$1.label = i - Integer.MIN_VALUE;
            } else {
                multiProductValidationComponent$updateQrState$1 = new MultiProductValidationComponent$updateQrState$1(multiProductValidationComponent, continuationImpl);
            }
        } else {
            multiProductValidationComponent$updateQrState$1 = new MultiProductValidationComponent$updateQrState$1(multiProductValidationComponent, continuationImpl);
        }
        Object obj = multiProductValidationComponent$updateQrState$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = multiProductValidationComponent$updateQrState$1.label;
        if (i2 == 0) {
            ResultKt.b(obj);
            mutex = multiProductValidationComponent.z;
            multiProductValidationComponent$updateQrState$1.L$0 = productValidationData;
            multiProductValidationComponent$updateQrState$1.L$1 = qRValidationLifecycleResult;
            multiProductValidationComponent$updateQrState$1.L$2 = mutex;
            multiProductValidationComponent$updateQrState$1.label = 1;
            if (mutex.a(multiProductValidationComponent$updateQrState$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mutex mutex2 = (Mutex) multiProductValidationComponent$updateQrState$1.L$2;
            qRValidationLifecycleResult = (QRValidationLifecycleResult) multiProductValidationComponent$updateQrState$1.L$1;
            ProductValidationData productValidationData2 = (ProductValidationData) multiProductValidationComponent$updateQrState$1.L$0;
            ResultKt.b(obj);
            mutex = mutex2;
            productValidationData = productValidationData2;
        }
        try {
            multiProductValidationComponent.E0(new ej0(2, qRValidationLifecycleResult, productValidationData));
            return Unit.f17538a;
        } finally {
            mutex.e(null);
        }
    }

    public final ChildValidationDelegate L0(ProductValidationData productValidationData) {
        Object next;
        Iterator it = M0().b().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((ChildValidationDelegate) next).b.getId().equals(productValidationData.getId())) {
                return (ChildValidationDelegate) next;
            }
        }
        next = null;
        return (ChildValidationDelegate) next;
    }

    public final MultiProductValidationConfig M0() {
        return (MultiProductValidationConfig) this.u.getValue();
    }

    public final boolean N0(MultiProductValidationDataState multiProductValidationDataState, long j) {
        Comparable comparable;
        MultiProductValidationData multiProductValidationData = multiProductValidationDataState.f10691a;
        if (multiProductValidationData != null) {
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.a(Long.valueOf(multiProductValidationData.w()));
            List list = multiProductValidationDataState.b;
            ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((MultiProductChildState) it.next()).f10688a.w()));
            }
            spreadBuilder.b(arrayList.toArray(new Long[0]));
            ArrayList arrayList2 = spreadBuilder.f17618a;
            FilteringSequence.AnonymousClass1 anonymousClass1 = new FilteringSequence.AnonymousClass1();
            if (anonymousClass1.hasNext()) {
                comparable = (Comparable) anonymousClass1.next();
                while (anonymousClass1.hasNext()) {
                    Comparable comparable2 = (Comparable) anonymousClass1.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
            } else {
                comparable = null;
            }
            Long l = (Long) comparable;
            if (l != null) {
                if (j - this.y >= l.longValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void O0(MultiProductValidationIntent intent) {
        Intrinsics.i(intent, "intent");
        C0(intent);
        boolean zEquals = intent.equals(MultiProductValidationIntent.InitializationIntent.f10695a);
        ContextScope contextScope = this.j;
        if (zEquals) {
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleInitializationIntent$1(this, null), 3);
            return;
        }
        if (intent instanceof MultiProductValidationIntent.ChildClickedIntent) {
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleChildClickedIntent$1(this, (MultiProductValidationIntent.ChildClickedIntent) intent, null), 3);
            return;
        }
        if (intent.equals(MultiProductValidationIntent.QRClickedIntent.f10697a)) {
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleQrClickedIntent$1(this, null), 3);
            return;
        }
        if (intent.equals(MultiProductValidationIntent.BackPressedIntent.f10692a)) {
            boolean z = ((MultiProductValidationDataState) this.f.getValue()).d.b;
            E0(new lj0(9));
            if (z) {
                return;
            }
            q0(new dk0(this, 4));
            return;
        }
        if (intent instanceof MultiProductValidationIntent.PunchEventReceivedIntent) {
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handlePunchEventReceivedIntent$1(this, (MultiProductValidationIntent.PunchEventReceivedIntent) intent, null), 3);
            return;
        }
        if (intent instanceof MultiProductValidationIntent.ViewReceiptIntent) {
            ChildValidationDelegate childValidationDelegateL0 = L0(((MultiProductValidationIntent.ViewReceiptIntent) intent).f10699a);
            if (childValidationDelegateL0 == null) {
                return;
            }
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleViewReceiptIntent$1(childValidationDelegateL0, null), 3);
            return;
        }
        if (intent.equals(MultiProductValidationIntent.ReportProblemIntent.f10698a)) {
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleReportProblemIntent$1(this, null), 3);
        } else {
            if (!intent.equals(MultiProductValidationIntent.ExpiryDialogGotItClickedIntent.f10694a)) {
                throw new NoWhenBranchMatchedException();
            }
            BuildersKt.d(contextScope, null, null, new MultiProductValidationComponent$handleExpiryDialogGotItClicked$1(this, null), 3);
        }
    }

    public final void P0(ProductValidationData productValidationData) {
        Job job = this.v;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        this.v = D0(new MultiProductValidationComponent$startQrLifecycle$1(this, productValidationData, null));
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object p0(Object obj, ContinuationImpl continuationImpl) {
        MultiProductValidationComponent$convertToUiState$2 multiProductValidationComponent$convertToUiState$2 = new MultiProductValidationComponent$convertToUiState$2(1, this, MultiProductValidationComponent.class, "processIntent", "processIntent(Lapp/chalo/validationsdk/multiproductvalidation/ui/MultiProductValidationIntent;)V", 0);
        dk0 dk0Var = new dk0(this, 1);
        dk0 dk0Var2 = new dk0(this, 2);
        return this.t.d((MultiProductValidationDataState) obj, multiProductValidationComponent$convertToUiState$2, dk0Var, dk0Var2, continuationImpl);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object u0() {
        return new MultiProductValidationDataState(null, EmptyList.f17557a, null, new ActiveQrState(), false);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final Object v0() {
        return new MultiProductValidationUIState(new ToolbarUIState(null, null, null, null, null, 0.0f, null, null, 255), null, 12);
    }

    @Override // app.chalo.mvibase.simple.ChaloBaseStateMviComponent
    public final void x0() {
        Job job = this.v;
        if (job != null) {
            ((JobSupport) job).cancel(null);
        }
        Job job2 = this.w;
        if (job2 != null) {
            ((JobSupport) job2).cancel(null);
        }
    }
}
