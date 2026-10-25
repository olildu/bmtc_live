package defpackage;

import app.chalo.premiumbus.ui.seatselection.PremiumBusSeatSelectionIntent;
import app.chalo.uistate.dialog.GenderSelectionDialogUIStateFactory;
import app.chalo.userprofile.Gender;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Gender c;

    public /* synthetic */ a60(Function1 function1, Gender gender, int i) {
        this.f166a = i;
        this.b = function1;
        this.c = gender;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f166a;
        Unit unit = Unit.f17538a;
        Gender gender = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                function1.invoke(gender);
                break;
            case 1:
                GenderSelectionDialogUIStateFactory genderSelectionDialogUIStateFactory = GenderSelectionDialogUIStateFactory.f10001a;
                function1.invoke(gender);
                break;
            case 2:
                function1.invoke(new PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent(gender));
                break;
            case 3:
                function1.invoke(new PremiumBusSeatSelectionIntent.GenderSelectionOptionSelectedIntent(gender));
                break;
            default:
                function1.invoke(new PremiumBusSeatSelectionIntent.GenderConfirmationBottomSheetConfirmBtnClickIntent(gender));
                break;
        }
        return unit;
    }
}
