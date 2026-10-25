package defpackage;

import app.chalo.livetracking.universalsearch.data.model.ui.UniversalSearchPlacesAndStopsInfoModel;
import app.chalo.livetracking.universalsearch.ui.UniversalPickerIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15753a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ UniversalSearchPlacesAndStopsInfoModel c;
    public final /* synthetic */ int d;

    public /* synthetic */ gp(Function1 function1, UniversalSearchPlacesAndStopsInfoModel universalSearchPlacesAndStopsInfoModel, int i, int i2) {
        this.f15753a = i2;
        this.b = function1;
        this.c = universalSearchPlacesAndStopsInfoModel;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f15753a) {
            case 0:
                this.b.invoke(new UniversalPickerIntent.UniversalSearchPlaceItemClickIntent(this.c, this.d));
                break;
            case 1:
                this.b.invoke(new UniversalPickerIntent.UniversalSearchPlaceItemClickIntent(this.c, this.d + 1));
                break;
            default:
                this.b.invoke(new UniversalPickerIntent.UniversalSearchStopItemClickIntent(this.c, this.d + 1));
                break;
        }
        return Unit.f17538a;
    }
}
