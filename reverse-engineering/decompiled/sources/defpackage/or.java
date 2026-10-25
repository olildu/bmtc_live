package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.text.contextmenu.ProcessTextApi23Impl;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuSession;
import androidx.compose.foundation.text.contextmenu.internal.ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.TextContextMenuDataProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.ui.text.TextRange;
import app.chalo.core.Multi_modal_group_ticket_child_table;
import app.chalo.premiumbus.ui.slotselection.PBSlotSelectionTabItemUIState;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionUiStateKt;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt;
import app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18666a;

    public /* synthetic */ or(int i) {
        this.f18666a = i;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.f18666a;
        Unit unit = Unit.f17538a;
        switch (i) {
            case 0:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_129995601$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 1:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda_636288403$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 2:
                return ComposableSingletons$DefaultTextContextMenuDropdownProvider_androidKt.lambda__1357803046$lambda$0((TextContextMenuSession) obj, (TextContextMenuDataProvider) obj2, (Function0) obj3, (Composer) obj4, ((Integer) obj5).intValue());
            case 3:
                BoxScope PremiumBusScrollableTabRow = (BoxScope) obj;
                PBSlotSelectionTabItemUIState tabInfo = (PBSlotSelectionTabItemUIState) obj2;
                ((Integer) obj3).getClass();
                Composer composer = (Composer) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ComposableLambda composableLambda = ComposableSingletons$PremiumBusScrollableTabRowKt.f7906a;
                Intrinsics.i(PremiumBusScrollableTabRow, "$this$PremiumBusScrollableTabRow");
                Intrinsics.i(tabInfo, "tabInfo");
                if ((iIntValue & 48) == 0) {
                    iIntValue |= composer.changed(tabInfo) ? 32 : 16;
                }
                if (composer.shouldExecute((iIntValue & 1041) != 1040, iIntValue & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1546082963, iIntValue, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusScrollableTabRowKt.lambda$-1546082963.<anonymous> (PremiumBusScrollableTabRow.kt:195)");
                    }
                    PremiumBusSlotSelectionUiStateKt.t(tabInfo, null, composer, (iIntValue >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer.skipToGroupEnd();
                }
                return unit;
            case 4:
                BoxScope PremiumBusScrollableTabRow2 = (BoxScope) obj;
                PBSlotSelectionTabItemUIState tabInfo2 = (PBSlotSelectionTabItemUIState) obj2;
                ((Integer) obj3).getClass();
                Composer composer2 = (Composer) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                ComposableLambda composableLambda2 = ComposableSingletons$PremiumBusSlotSelectionScreenKt.f7907a;
                Intrinsics.i(PremiumBusScrollableTabRow2, "$this$PremiumBusScrollableTabRow");
                Intrinsics.i(tabInfo2, "tabInfo");
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= composer2.changed(tabInfo2) ? 32 : 16;
                }
                if (composer2.shouldExecute((iIntValue2 & 1041) != 1040, iIntValue2 & 1)) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-16588917, iIntValue2, -1, "app.chalo.premiumbus.ui.slotselection.compose.ComposableSingletons$PremiumBusSlotSelectionScreenKt.lambda$-16588917.<anonymous> (PremiumBusSlotSelectionScreen.kt:422)");
                    }
                    PremiumBusSlotSelectionUiStateKt.t(tabInfo2, null, composer2, (iIntValue2 >> 3) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    composer2.skipToGroupEnd();
                }
                return unit;
            case 5:
                String groupId = (String) obj;
                long jLongValue = ((Long) obj2).longValue();
                String subTicketId_ = (String) obj3;
                String productType_ = (String) obj4;
                String productSubType_ = (String) obj5;
                Intrinsics.i(groupId, "groupId");
                Intrinsics.i(subTicketId_, "subTicketId_");
                Intrinsics.i(productType_, "productType_");
                Intrinsics.i(productSubType_, "productSubType_");
                return new Multi_modal_group_ticket_child_table(groupId, subTicketId_, productType_, productSubType_, jLongValue);
            case 6:
                String groupId2 = (String) obj;
                long jLongValue2 = ((Long) obj2).longValue();
                String subTicketId = (String) obj3;
                String productType = (String) obj4;
                String productSubType = (String) obj5;
                Intrinsics.i(groupId2, "groupId");
                Intrinsics.i(subTicketId, "subTicketId");
                Intrinsics.i(productType, "productType");
                Intrinsics.i(productSubType, "productSubType");
                return new Multi_modal_group_ticket_child_table(groupId2, subTicketId, productType, productSubType, jLongValue2);
            case 7:
                String groupId_ = (String) obj;
                long jLongValue3 = ((Long) obj2).longValue();
                String subTicketId2 = (String) obj3;
                String productType2 = (String) obj4;
                String productSubType2 = (String) obj5;
                Intrinsics.i(groupId_, "groupId_");
                Intrinsics.i(subTicketId2, "subTicketId");
                Intrinsics.i(productType2, "productType");
                Intrinsics.i(productSubType2, "productSubType");
                return new Multi_modal_group_ticket_child_table(groupId_, subTicketId2, productType2, productSubType2, jLongValue3);
            case 8:
                String groupId_2 = (String) obj;
                long jLongValue4 = ((Long) obj2).longValue();
                String subTicketId3 = (String) obj3;
                String productType3 = (String) obj4;
                String productSubType3 = (String) obj5;
                Intrinsics.i(groupId_2, "groupId_");
                Intrinsics.i(subTicketId3, "subTicketId");
                Intrinsics.i(productType3, "productType");
                Intrinsics.i(productSubType3, "productSubType");
                return new Multi_modal_group_ticket_child_table(groupId_2, subTicketId3, productType3, productSubType3, jLongValue4);
            default:
                return ProcessTextApi23Impl.onClickProcessTextItem$lambda$0((Context) obj, (ResolveInfo) obj2, ((Boolean) obj3).booleanValue(), (CharSequence) obj4, (TextRange) obj5);
        }
    }
}
