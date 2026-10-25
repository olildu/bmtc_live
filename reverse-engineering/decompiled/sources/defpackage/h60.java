package defpackage;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KMutableProperty0;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class h60 implements GoogleMap.OnMapLongClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15795a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h60(Object obj, int i) {
        this.f15795a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLongClickListener
    public final void onMapLongClick(LatLng it) {
        switch (this.f15795a) {
            case 0:
                ProducerScope producerScope = (ProducerScope) this.b;
                Intrinsics.f(it);
                producerScope.mo7576trySendJP2dKIU(it);
                break;
            default:
                KMutableProperty0 kMutableProperty0 = (KMutableProperty0) this.b;
                Intrinsics.i(it, "it");
                Function1 function1 = (Function1) kMutableProperty0.invoke();
                if (function1 != null) {
                    function1.invoke(it);
                }
                break;
        }
    }
}
