package app.chalo.permissions.gps;

import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import app.chalo.location.SettingsResolutionException;
import com.google.android.gms.common.api.ResolvableApiException;
import defpackage.eh0;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/permissions/gps/GpsRequestHandlerAndroid;", "Lapp/chalo/permissions/gps/GpsRequestHandler;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class GpsRequestHandlerAndroid implements GpsRequestHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eh0 f6818a;
    public final MutableStateFlow b = StateFlowKt.a(new GpsRequestInfo(0, false));

    public GpsRequestHandlerAndroid(eh0 eh0Var) {
        this.f6818a = eh0Var;
    }

    @Override // app.chalo.permissions.gps.GpsRequestHandler
    public final Flow a(SettingsResolutionException exc) {
        PendingIntent resolution;
        Intrinsics.i(exc, "exc");
        final long jCurrentTimeMillis = System.currentTimeMillis();
        ResolvableApiException resolvableApiException = exc.f5159a;
        IntentSender intentSender = (resolvableApiException == null || (resolution = resolvableApiException.getResolution()) == null) ? null : resolution.getIntentSender();
        if (intentSender != null) {
            this.f6818a.invoke(new IntentSenderRequest.Builder(intentSender).build());
        }
        final MutableStateFlow mutableStateFlow = this.b;
        return FlowKt.m(new Flow<Boolean>() { // from class: app.chalo.permissions.gps.GpsRequestHandlerAndroid$requestGpsPermission$$inlined$mapNotNull$1

            /* JADX INFO: renamed from: app.chalo.permissions.gps.GpsRequestHandlerAndroid$requestGpsPermission$$inlined$mapNotNull$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            public final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f6820a;
                public final /* synthetic */ long b;

                /* JADX INFO: renamed from: app.chalo.permissions.gps.GpsRequestHandlerAndroid$requestGpsPermission$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                @DebugMetadata(c = "app.chalo.permissions.gps.GpsRequestHandlerAndroid$requestGpsPermission$$inlined$mapNotNull$1$2", f = "GpsRequestHandler.android.kt", l = {56}, m = "emit", v = 1)
                public final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, long j) {
                    this.f6820a = flowCollector;
                    this.b = j;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(Object obj, Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        ResultKt.b(obj2);
                        GpsRequestInfo gpsRequestInfo = (GpsRequestInfo) obj;
                        Boolean boolValueOf = gpsRequestInfo.b >= this.b ? Boolean.valueOf(gpsRequestInfo.f6822a) : null;
                        if (boolValueOf != null) {
                            anonymousClass1.label = 1;
                            if (this.f6820a.emit(boolValueOf, anonymousClass1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.b(obj2);
                    }
                    return Unit.f17538a;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public final Object collect(FlowCollector flowCollector, Continuation continuation) {
                Object objCollect = mutableStateFlow.collect(new AnonymousClass2(flowCollector, jCurrentTimeMillis), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : Unit.f17538a;
            }
        });
    }

    public final void b(ActivityResult result) {
        MutableStateFlow mutableStateFlow;
        Object value;
        Intrinsics.i(result, "result");
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            mutableStateFlow = this.b;
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.c(value, new GpsRequestInfo(jCurrentTimeMillis, result.getResultCode() == -1)));
    }
}
