package app.chalo.uistate.dialog;

import app.chalo.compose.theme.ChaloThemeHelper;
import app.chalo.uistate.base.ChaloColorToken;
import app.chalo.uistate.button.ButtonUIState;
import app.chalo.uistate.divider.DividerOrientation;
import app.chalo.uistate.divider.DividerUIState;
import app.chalo.uistate.image.ImageUIState;
import app.chalo.uistate.text.TextUIState;
import defpackage.dd;
import defpackage.py;
import defpackage.r30;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/uistate/dialog/MultiSelectDatePickerUIState;", "", "chalo-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class MultiSelectDatePickerUIState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextUIState f10009a;
    public final TextUIState b;
    public final List c;
    public final List d;
    public final ImageUIState e;
    public final ButtonUIState f;
    public final ButtonUIState g;
    public final DatesLoadingUIState h;
    public final DividerUIState i;
    public final MultiSelectDatePickerSpec j;
    public final WeekDayHeaderUIState k;

    public MultiSelectDatePickerUIState(TextUIState.ChaloTextUIState chaloTextUIState, TextUIState.ChaloTextUIState chaloTextUIState2, List list, ArrayList arrayList, ImageUIState cancelIconUIState, ButtonUIState proceedBtnUIState, ButtonUIState buttonUIState, DatesLoadingUIState datesLoadingUIState, WeekDayHeaderUIState weekDayHeaderUIState, int i) {
        datesLoadingUIState = (i & 128) != 0 ? null : datesLoadingUIState;
        DividerUIState dividerUIState = new DividerUIState(ChaloThemeHelper.a().c, ChaloColorToken.SectionDividerColor.f9849a, DividerOrientation.Horizontal);
        MultiSelectDatePickerSpec multiSelectDatePickerSpec = new MultiSelectDatePickerSpec();
        Intrinsics.i(cancelIconUIState, "cancelIconUIState");
        Intrinsics.i(proceedBtnUIState, "proceedBtnUIState");
        this.f10009a = chaloTextUIState;
        this.b = chaloTextUIState2;
        this.c = list;
        this.d = arrayList;
        this.e = cancelIconUIState;
        this.f = proceedBtnUIState;
        this.g = buttonUIState;
        this.h = datesLoadingUIState;
        this.i = dividerUIState;
        this.j = multiSelectDatePickerSpec;
        this.k = weekDayHeaderUIState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiSelectDatePickerUIState)) {
            return false;
        }
        MultiSelectDatePickerUIState multiSelectDatePickerUIState = (MultiSelectDatePickerUIState) obj;
        return Intrinsics.d(this.f10009a, multiSelectDatePickerUIState.f10009a) && Intrinsics.d(this.b, multiSelectDatePickerUIState.b) && Intrinsics.d(this.c, multiSelectDatePickerUIState.c) && Intrinsics.d(this.d, multiSelectDatePickerUIState.d) && Intrinsics.d(this.e, multiSelectDatePickerUIState.e) && Intrinsics.d(this.f, multiSelectDatePickerUIState.f) && Intrinsics.d(this.g, multiSelectDatePickerUIState.g) && Intrinsics.d(this.h, multiSelectDatePickerUIState.h) && Intrinsics.d(this.i, multiSelectDatePickerUIState.i) && Intrinsics.d(this.j, multiSelectDatePickerUIState.j) && Intrinsics.d(this.k, multiSelectDatePickerUIState.k);
    }

    public final int hashCode() {
        TextUIState textUIState = this.f10009a;
        int iHashCode = (textUIState == null ? 0 : textUIState.hashCode()) * 31;
        TextUIState textUIState2 = this.b;
        int iHashCode2 = (iHashCode + (textUIState2 == null ? 0 : textUIState2.hashCode())) * 31;
        List list = this.c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        int iD = r30.d(this.g, r30.d(this.f, r30.e(this.e, (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31), 31), 31);
        DatesLoadingUIState datesLoadingUIState = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + py.c(this.i, (iD + (datesLoadingUIState != null ? datesLoadingUIState.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiSelectDatePickerUIState(titleTextUIState=");
        sb.append(this.f10009a);
        sb.append(", subtitleUIState=");
        sb.append(this.b);
        sb.append(", months=");
        dd.o(sb, this.c, ", legendUIState=", this.d, ", cancelIconUIState=");
        sb.append(this.e);
        sb.append(", proceedBtnUIState=");
        sb.append(this.f);
        sb.append(", cancelButtonUIState=");
        sb.append(this.g);
        sb.append(", loadingUIState=");
        sb.append(this.h);
        sb.append(", dividerUIState=");
        sb.append(this.i);
        sb.append(", spec=");
        sb.append(this.j);
        sb.append(", weekDayHeaderUIState=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
