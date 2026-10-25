package app.chalo.compose.components.chalomap;

import androidx.compose.runtime.MutableState;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.maps.android.compose.CameraPositionState;
import j$.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MapCameraViewState f1885a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ a(MapCameraViewState mapCameraViewState, Function1 function1, MutableState mutableState) {
        this.f1885a = mapCameraViewState;
        this.b = function1;
        this.c = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        MapCameraViewState mapCameraViewState = this.f1885a;
        Function1 function1 = this.b;
        MutableState mutableState = this.c;
        CameraPositionState rememberCameraPositionState = (CameraPositionState) obj;
        Intrinsics.i(rememberCameraPositionState, "$this$rememberCameraPositionState");
        Objects.toString(mapCameraViewState);
        if (mapCameraViewState instanceof MapCameraViewState.InitialState) {
            MapCameraViewState.InitialState initialState = (MapCameraViewState.InitialState) mapCameraViewState;
            if (initialState instanceof MapCameraViewState.InitialState.CustomPosition) {
                MapCameraViewState.InitialState.CustomPosition customPosition = (MapCameraViewState.InitialState.CustomPosition) mapCameraViewState;
                CameraPosition cameraPosition = new CameraPosition(customPosition.f1880a.b(), customPosition.b, 0.0f, 0.0f);
                synchronized (rememberCameraPositionState.d) {
                    GoogleMap googleMapB = rememberCameraPositionState.b();
                    if (googleMapB == null) {
                        rememberCameraPositionState.c.setValue(cameraPosition);
                    } else {
                        googleMapB.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                    }
                }
                mutableState.setValue((CameraPosition) rememberCameraPositionState.c.getValue());
            } else if (initialState instanceof MapCameraViewState.InitialState.CustomCameraUpdate) {
                MapCameraViewState.InitialState.CustomCameraUpdate customCameraUpdate = (MapCameraViewState.InitialState.CustomCameraUpdate) mapCameraViewState;
                MapCameraUpdate mapCameraUpdate = customCameraUpdate.f1879a;
                if (mapCameraUpdate instanceof AndroidCameraUpdate) {
                    rememberCameraPositionState.c(((AndroidCameraUpdate) mapCameraUpdate).f1859a);
                    function1.invoke(customCameraUpdate.f1879a);
                }
            } else if (!initialState.equals(MapCameraViewState.InitialState.NoState.f1881a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.f17538a;
    }
}
