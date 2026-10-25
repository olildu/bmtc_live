package defpackage;

import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.home.ui.regularbus.compose.RegularBusScreenUIKt;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n11 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18445a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ RegularBusPageDisplayItemData c;
    public final /* synthetic */ int d;

    public /* synthetic */ n11(int i, RegularBusPageDisplayItemData regularBusPageDisplayItemData, Function1 function1) {
        this.f18445a = 0;
        this.c = regularBusPageDisplayItemData;
        this.b = function1;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18445a) {
            case 0:
                RegularBusPageDisplayItemData regularBusPageDisplayItemData = this.c;
                RegularBusPageFeature regularBusPageFeature = regularBusPageDisplayItemData.g;
                switch (regularBusPageFeature == null ? -1 : RegularBusScreenUIKt.WhenMappings.f3669a[regularBusPageFeature.ordinal()]) {
                    case -1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        RegularBusPageFeature regularBusPageFeature2 = regularBusPageDisplayItemData.g;
                        TextFormatAppModel textFormatAppModel = regularBusPageDisplayItemData.c;
                        this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature2, null, textFormatAppModel != null ? ChaloTextDataKt.a(textFormatAppModel) : null, this.d, null, null, null, 114));
                        break;
                }
                return Unit.f17538a;
            case 1:
                RegularBusPageDisplayItemData regularBusPageDisplayItemData2 = this.c;
                RegularBusPageFeature regularBusPageFeature3 = regularBusPageDisplayItemData2.g;
                TextFormatAppModel textFormatAppModel2 = regularBusPageDisplayItemData2.c;
                this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature3, null, textFormatAppModel2 != null ? ChaloTextDataKt.a(textFormatAppModel2) : null, this.d, null, null, null, 114));
                break;
            default:
                RegularBusPageDisplayItemData regularBusPageDisplayItemData3 = this.c;
                RegularBusPageFeature regularBusPageFeature4 = regularBusPageDisplayItemData3.g;
                TextFormatAppModel textFormatAppModel3 = regularBusPageDisplayItemData3.c;
                this.b.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature4, null, textFormatAppModel3 != null ? ChaloTextDataKt.a(textFormatAppModel3) : null, this.d, null, null, null, 114));
                break;
        }
        return Unit.f17538a;
    }

    public /* synthetic */ n11(Function1 function1, RegularBusPageDisplayItemData regularBusPageDisplayItemData, int i, int i2) {
        this.f18445a = i2;
        this.b = function1;
        this.c = regularBusPageDisplayItemData;
        this.d = i;
    }
}
