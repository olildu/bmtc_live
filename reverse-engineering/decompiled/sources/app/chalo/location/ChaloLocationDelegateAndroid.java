package app.chalo.location;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import app.chalo.crashlytics.CrashlyticsLogger;
import app.chalo.location.ChaloLocationDelegateAndroid;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/location/ChaloLocationDelegateAndroid;", "Lapp/chalo/location/ChaloLocationDelegate;", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ChaloLocationDelegateAndroid implements ChaloLocationDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5115a;
    public final CrashlyticsLogger b;
    public final Lazy c;
    public final Lazy d;

    public ChaloLocationDelegateAndroid(Context context, CrashlyticsLogger crashlyticsLogger) {
        this.f5115a = context;
        this.b = crashlyticsLogger;
        final int i = 0;
        this.c = LazyKt.b(new Function0(this) { // from class: rk
            public final /* synthetic */ ChaloLocationDelegateAndroid b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return LocationServices.getFusedLocationProviderClient(this.b.f5115a);
                    default:
                        this.b.getClass();
                        LocationRequest priority = LocationRequest.create().setInterval(1000L).setPriority(100);
                        Intrinsics.h(priority, "setPriority(...)");
                        return priority;
                }
            }
        });
        final int i2 = 1;
        this.d = LazyKt.b(new Function0(this) { // from class: rk
            public final /* synthetic */ ChaloLocationDelegateAndroid b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return LocationServices.getFusedLocationProviderClient(this.b.f5115a);
                    default:
                        this.b.getClass();
                        LocationRequest priority = LocationRequest.create().setInterval(1000L).setPriority(100);
                        Intrinsics.h(priority, "setPriority(...)");
                        return priority;
                }
            }
        });
    }

    @Override // app.chalo.location.ChaloLocationDelegate
    public final Object a(Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        ((FusedLocationProviderClient) this.c.getValue()).getLastLocation().addOnCompleteListener(new OnCompleteListener(this) { // from class: app.chalo.location.ChaloLocationDelegateAndroid$getLastKnownLocation$2$1
            public final /* synthetic */ ChaloLocationDelegateAndroid b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task it) {
                SafeContinuation safeContinuation2 = safeContinuation;
                Intrinsics.i(it, "it");
                try {
                    Location location = (Location) it.getResult();
                    safeContinuation2.resumeWith(new LatLng(location.getLatitude(), location.getLongitude()));
                } catch (Exception e) {
                    this.b.b.i(e);
                    safeContinuation2.resumeWith(null);
                }
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$getLastKnownLocation$2$2
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                safeContinuation.resumeWith(null);
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // app.chalo.location.ChaloLocationDelegate
    public final Boolean b() {
        Object systemService = this.f5115a.getSystemService(FirebaseAnalytics.Param.LOCATION);
        LocationManager locationManager = systemService instanceof LocationManager ? (LocationManager) systemService : null;
        return locationManager == null ? Boolean.FALSE : Boolean.valueOf(locationManager.isProviderEnabled("gps"));
    }

    @Override // app.chalo.location.ChaloLocationDelegate
    public final Object c(Continuation continuation) throws Throwable {
        LocationSettingsRequest.Builder builderAddLocationRequest = new LocationSettingsRequest.Builder().addLocationRequest((LocationRequest) this.d.getValue());
        Intrinsics.h(builderAddLocationRequest, "addLocationRequest(...)");
        SettingsClient settingsClient = LocationServices.getSettingsClient(this.f5115a);
        Intrinsics.h(settingsClient, "getSettingsClient(...)");
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        Task<LocationSettingsResponse> taskCheckLocationSettings = settingsClient.checkLocationSettings(builderAddLocationRequest.build());
        final Function1<LocationSettingsResponse, Unit> function1 = new Function1<LocationSettingsResponse, Unit>() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$checkSystemLocationSettings$2$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                LocationSettingsResponse result = (LocationSettingsResponse) obj;
                Intrinsics.i(result, "result");
                safeContinuation.resumeWith(LocationManagerResult.LocationPreconditionsStatus.SystemConditionsSatisfied.f5146a);
                return Unit.f17538a;
            }
        };
        taskCheckLocationSettings.addOnSuccessListener(new OnSuccessListener() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$sam$com_google_android_gms_tasks_OnSuccessListener$0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final /* synthetic */ void onSuccess(Object obj) {
                function1.invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$checkSystemLocationSettings$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exception) {
                Intrinsics.i(exception, "exception");
                this.f5117a.b.i(exception);
                boolean z = exception instanceof ApiException;
                SafeContinuation safeContinuation2 = safeContinuation;
                if (!z) {
                    safeContinuation2.resumeWith(new LocationManagerResult.LocationPreconditionsStatus.GeneralException(exception));
                    return;
                }
                int statusCode = ((ApiException) exception).getStatusCode();
                if (statusCode == 6) {
                    safeContinuation2.resumeWith(exception instanceof ResolvableApiException ? new LocationManagerResult.LocationPreconditionsStatus.SettingsResolutionRequired(new SettingsResolutionException((ResolvableApiException) exception)) : new LocationManagerResult.LocationPreconditionsStatus.GeneralException(exception));
                } else {
                    if (statusCode != 8502) {
                        return;
                    }
                    safeContinuation2.resumeWith(LocationManagerResult.LocationPreconditionsStatus.SettingsUnavailable.f5145a);
                }
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$checkSystemLocationSettings$2$3
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                safeContinuation.resumeWith(LocationManagerResult.LocationPreconditionsStatus.ProcessCancelled.f5142a);
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }

    @Override // app.chalo.location.ChaloLocationDelegate
    public final Object d() {
        return FlowKt.e(new ChaloLocationDelegateAndroid$getLocationUpdatesFlow$2(this, null));
    }

    @Override // app.chalo.location.ChaloLocationDelegate
    public final Object e(Continuation continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.c(continuation));
        ((FusedLocationProviderClient) this.c.getValue()).getCurrentLocation(100, (CancellationToken) null).addOnCompleteListener(new OnCompleteListener(this) { // from class: app.chalo.location.ChaloLocationDelegateAndroid$getCurrentLocation$2$1
            public final /* synthetic */ ChaloLocationDelegateAndroid b;

            {
                this.b = this;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task it) {
                SafeContinuation safeContinuation2 = safeContinuation;
                Intrinsics.i(it, "it");
                try {
                    Location location = (Location) it.getResult();
                    safeContinuation2.resumeWith(new LatLng(location.getLatitude(), location.getLongitude()));
                } catch (Exception e) {
                    this.b.b.i(e);
                    safeContinuation2.resumeWith(null);
                }
            }
        }).addOnCanceledListener(new OnCanceledListener() { // from class: app.chalo.location.ChaloLocationDelegateAndroid$getCurrentLocation$2$2
            @Override // com.google.android.gms.tasks.OnCanceledListener
            public final void onCanceled() {
                safeContinuation.resumeWith(null);
            }
        });
        Object objB = safeContinuation.b();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objB;
    }
}
