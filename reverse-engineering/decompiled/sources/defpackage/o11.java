package defpackage;

import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.homescreen.data.model.app.ImageResourceSectionAppModel;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class o11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18561a = 1;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ RegularBusPageDisplayItemData c;
    public final /* synthetic */ ImageResourceSectionAppModel d;
    public final /* synthetic */ int e;

    public /* synthetic */ o11(Function1 function1, RegularBusPageDisplayItemData regularBusPageDisplayItemData, ImageResourceSectionAppModel imageResourceSectionAppModel, int i) {
        this.b = function1;
        this.c = regularBusPageDisplayItemData;
        this.d = imageResourceSectionAppModel;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18561a) {
            case 0:
                RegularBusPageFeature regularBusPageFeature = RegularBusPageFeature.IMAGE_RESOURCE;
                ImageResourceSectionAppModel imageResourceSectionAppModel = this.d;
                this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature, null, imageResourceSectionAppModel.g, this.e, imageResourceSectionAppModel.c, imageResourceSectionAppModel.f, this.c.s, 2));
                break;
            default:
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = this.c;
                RegularBusPageFeature regularBusPageFeature2 = regularBusPageDisplayItemData.g;
                if (regularBusPageFeature2 == null) {
                    regularBusPageFeature2 = RegularBusPageFeature.IMAGE_RESOURCE;
                }
                ImageResourceSectionAppModel imageResourceSectionAppModel2 = this.d;
                this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature2, null, imageResourceSectionAppModel2.g, this.e, imageResourceSectionAppModel2.c, imageResourceSectionAppModel2.f, regularBusPageDisplayItemData.s, 2));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ o11(Function1 function1, ImageResourceSectionAppModel imageResourceSectionAppModel, int i, RegularBusPageDisplayItemData regularBusPageDisplayItemData) {
        this.b = function1;
        this.d = imageResourceSectionAppModel;
        this.e = i;
        this.c = regularBusPageDisplayItemData;
    }
}
