package defpackage;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.DividerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import app.chalo.compose.theme.ChaloTheme;
import app.chalo.data.ChaloTextDataKt;
import app.chalo.data.PremiumBusProductModificationReasonAppModel;
import app.chalo.data.TextFormatAppModel;
import app.chalo.home.ui.regularbus.RegularBusPageDisplayItemData;
import app.chalo.home.ui.regularbus.RegularBusViewIntent;
import app.chalo.homescreen.data.model.app.RegularBusPageFeature;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class iu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17092a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ iu0(int i, List list, Function1 function1) {
        this.f17092a = i;
        this.b = list;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f17092a) {
            case 0:
                LazyListScope LazyColumn = (LazyListScope) obj;
                Intrinsics.i(LazyColumn, "$this$LazyColumn");
                final List list = this.b;
                int size = list.size();
                Function1<Integer, Object> function1 = new Function1<Integer, Object>() { // from class: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsList$lambda$0$0$$inlined$itemsIndexed$default$2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        list.get(((Number) obj2).intValue());
                        return null;
                    }
                };
                final Function1 function2 = this.c;
                LazyColumn.items(size, null, function1, ComposableLambdaKt.composableLambdaInstance(2039820996, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsList$lambda$0$0$$inlined$itemsIndexed$default$3
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        int i;
                        LazyItemScope lazyItemScope = (LazyItemScope) obj2;
                        int iIntValue = ((Number) obj3).intValue();
                        Composer composer = (Composer) obj4;
                        int iIntValue2 = ((Number) obj5).intValue();
                        if ((iIntValue2 & 6) == 0) {
                            i = (composer.changed(lazyItemScope) ? 4 : 2) | iIntValue2;
                        } else {
                            i = iIntValue2;
                        }
                        if ((iIntValue2 & 48) == 0) {
                            i |= composer.changed(iIntValue) ? 32 : 16;
                        }
                        if (composer.shouldExecute((i & 147) != 146, i & 1)) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                            }
                            final PremiumBusProductModificationReasonAppModel premiumBusProductModificationReasonAppModel = (PremiumBusProductModificationReasonAppModel) list.get(iIntValue);
                            composer.startReplaceGroup(-1154612509);
                            final Function1 function3 = function2;
                            boolean zChanged = composer.changed(function3) | composer.changedInstance(premiumBusProductModificationReasonAppModel);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0<Unit>() { // from class: app.chalo.premiumbus.prebookedtickets.productmodification.PremiumBusProductModificationReasonsScreenKt$PremiumBusProductModificationReasonsList$1$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function3.invoke(premiumBusProductModificationReasonAppModel);
                                        return Unit.f17538a;
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            PremiumBusProductModificationReasonsScreenKt.d(premiumBusProductModificationReasonAppModel, (Function0) objRememberedValue, null, composer, 0);
                            if (iIntValue != CollectionsKt.K(list)) {
                                composer.startReplaceGroup(-1154434725);
                                DividerKt.m1949Divider9IZ8Weo(PaddingKt.m786paddingVpY3zN4$default(Modifier.INSTANCE, ChaloTheme.b(composer, 0).h, 0.0f, 2, null), ChaloTheme.b(composer, 0).b, ChaloTheme.a(composer, 0).m, composer, 0, 0);
                            } else {
                                composer.startReplaceGroup(-1165976521);
                            }
                            composer.endReplaceGroup();
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composer.skipToGroupEnd();
                        }
                        return Unit.f17538a;
                    }
                }));
                break;
            default:
                RegularBusPageDisplayItemData it = (RegularBusPageDisplayItemData) obj;
                Intrinsics.i(it, "it");
                int iIndexOf = this.b.indexOf(it);
                RegularBusPageFeature regularBusPageFeature = it.g;
                if (regularBusPageFeature != null) {
                    TextFormatAppModel textFormatAppModel = it.c;
                    this.c.invoke(new RegularBusViewIntent.RegularBusPageItemClickedIntent(regularBusPageFeature, null, textFormatAppModel != null ? ChaloTextDataKt.a(textFormatAppModel) : null, iIndexOf, null, null, null, 114));
                }
                break;
        }
        return Unit.f17538a;
    }
}
