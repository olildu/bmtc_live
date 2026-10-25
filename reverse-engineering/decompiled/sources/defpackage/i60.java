package defpackage;

import com.google.android.gms.maps.GoogleMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KMutableProperty0;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class i60 implements GoogleMap.OnMyLocationButtonClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15884a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i60(Object obj, int i) {
        this.f15884a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener
    public final boolean onMyLocationButtonClick() {
        switch (this.f15884a) {
            case 0:
                return !(((ProducerScope) this.b).mo7576trySendJP2dKIU(Unit.f17538a) instanceof ChannelResult.Failed);
            default:
                Function0 function0 = (Function0) ((KMutableProperty0) this.b).invoke();
                if (function0 != null) {
                    return ((Boolean) function0.invoke()).booleanValue();
                }
                return false;
        }
    }
}
