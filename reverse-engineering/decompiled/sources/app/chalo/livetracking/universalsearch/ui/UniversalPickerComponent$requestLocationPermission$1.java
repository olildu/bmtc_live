package app.chalo.livetracking.universalsearch.ui;

import app.chalo.constants.Source;
import app.chalo.permissions.handler.PermissionHandler;
import app.chalo.permissions.models.AppPermission;
import app.chalo.utils.AppLocationPermissionState;
import defpackage.vm1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$requestLocationPermission$1", f = "UniversalPickerComponent.kt", l = {1519}, m = "invokeSuspend", v = 1)
final class UniversalPickerComponent$requestLocationPermission$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AppPermission> $permissionList;
    int label;
    final /* synthetic */ UniversalPickerComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UniversalPickerComponent$requestLocationPermission$1(UniversalPickerComponent universalPickerComponent, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = universalPickerComponent;
        this.$permissionList = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UniversalPickerComponent$requestLocationPermission$1(this.this$0, this.$permissionList, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((UniversalPickerComponent$requestLocationPermission$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f17538a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            ResultKt.b(obj);
            PermissionHandler permissionHandlerC = this.this$0.A.c();
            if (permissionHandlerC != null) {
                Flow flowA = permissionHandlerC.a(this.$permissionList);
                final UniversalPickerComponent universalPickerComponent = this.this$0;
                FlowCollector flowCollector = new FlowCollector() { // from class: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$requestLocationPermission$1.1

                    /* JADX INFO: renamed from: app.chalo.livetracking.universalsearch.ui.UniversalPickerComponent$requestLocationPermission$1$1$WhenMappings */
                    /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
                    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                    public static final /* synthetic */ class WhenMappings {

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public static final /* synthetic */ int[] f5049a;

                        static {
                            int[] iArr = new int[AppLocationPermissionState.values().length];
                            try {
                                iArr[AppLocationPermissionState.FINE_LOCATION_PROVIDED.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_NOT_TRIGGERED.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            try {
                                iArr[AppLocationPermissionState.COARSE_LOCATION_PROVIDED_AND_UPGRADE_DENIED.ordinal()] = 3;
                            } catch (NoSuchFieldError unused3) {
                            }
                            try {
                                iArr[AppLocationPermissionState.NO_PERMISSION_GRANTED.ordinal()] = 4;
                            } catch (NoSuchFieldError unused4) {
                            }
                            f5049a = iArr;
                        }
                    }

                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final Object emit(Object obj2, Continuation continuation) {
                        UniversalPickerComponent universalPickerComponent2 = universalPickerComponent;
                        int i2 = WhenMappings.f5049a[universalPickerComponent2.C.a(Source.HOME_SCREEN_TAB, MapsKt.q((List) obj2)).ordinal()];
                        if (i2 != 1) {
                            if (i2 == 2) {
                                List listR = CollectionsKt.R(AppPermission.FINE_LOCATION);
                                Job job = universalPickerComponent2.G;
                                if (job != null) {
                                    ((JobSupport) job).cancel(null);
                                }
                                universalPickerComponent2.G = BuildersKt.d(universalPickerComponent2.j, null, null, new UniversalPickerComponent$requestLocationPermission$1(universalPickerComponent2, listR, null), 3);
                            } else {
                                if (i2 != 3 && i2 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                universalPickerComponent2.E0(new vm1(8));
                            }
                        }
                        return Unit.f17538a;
                    }
                };
                this.label = 1;
                if (flowA.collect(flowCollector, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
