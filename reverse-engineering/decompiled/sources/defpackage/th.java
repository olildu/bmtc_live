package defpackage;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import app.chalo.home.ui.chalobus.ChaloBusProductItemData;
import app.chalo.home.ui.regularbus.RegularBusProductItemData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class th implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19657a;
    public final /* synthetic */ List b;
    public final /* synthetic */ MutableState c;

    public /* synthetic */ th(List list, MutableState mutableState, int i) {
        this.f19657a = i;
        this.b = list;
        this.c = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f19657a) {
            case 0:
                SubcomposeMeasureScope SubcomposeLayout = (SubcomposeMeasureScope) obj;
                Constraints constraints = (Constraints) obj2;
                Intrinsics.i(SubcomposeLayout, "$this$SubcomposeLayout");
                List list = this.b;
                ArrayList arrayList = new ArrayList(CollectionsKt.v(list, 10));
                Iterator it = list.iterator();
                int i = 0;
                while (true) {
                    Integer num = null;
                    if (!it.hasNext()) {
                        Iterator it2 = arrayList.iterator();
                        if (it2.hasNext()) {
                            Integer numValueOf = Integer.valueOf(((Placeable) ((List) it2.next()).get(0)).getHeight());
                            while (true) {
                                num = numValueOf;
                                while (true) {
                                    if (it2.hasNext()) {
                                        numValueOf = Integer.valueOf(((Placeable) ((List) it2.next()).get(0)).getHeight());
                                        if (num.compareTo(numValueOf) < 0) {
                                        }
                                    }
                                }
                            }
                        }
                        this.c.setValue(Integer.valueOf(num != null ? num.intValue() : 0));
                        return MeasureScope.CC.s(SubcomposeLayout, 0, 0, null, new ah(16), 4, null);
                    }
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    List<Measurable> listSubcompose = SubcomposeLayout.subcompose(vo1.j(i, "item_"), ComposableLambdaKt.composableLambdaInstance(22593616, true, new n4((ChaloBusProductItemData) next, 5)));
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.v(listSubcompose, 10));
                    Iterator<T> it3 = listSubcompose.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(((Measurable) it3.next()).mo5939measureBRTryo0(constraints.getValue()));
                    }
                    arrayList.add(arrayList2);
                    i = i2;
                }
                break;
            default:
                SubcomposeMeasureScope SubcomposeLayout2 = (SubcomposeMeasureScope) obj;
                Constraints constraints2 = (Constraints) obj2;
                Intrinsics.i(SubcomposeLayout2, "$this$SubcomposeLayout");
                List list2 = this.b;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.v(list2, 10));
                Iterator it4 = list2.iterator();
                int i3 = 0;
                while (true) {
                    Integer num2 = null;
                    if (!it4.hasNext()) {
                        Iterator it5 = arrayList3.iterator();
                        if (it5.hasNext()) {
                            Integer numValueOf2 = Integer.valueOf(((Placeable) ((List) it5.next()).get(0)).getHeight());
                            while (true) {
                                num2 = numValueOf2;
                                while (true) {
                                    if (it5.hasNext()) {
                                        numValueOf2 = Integer.valueOf(((Placeable) ((List) it5.next()).get(0)).getHeight());
                                        if (num2.compareTo(numValueOf2) < 0) {
                                        }
                                    }
                                }
                            }
                        }
                        this.c.setValue(Integer.valueOf(num2 != null ? num2.intValue() : 0));
                        return MeasureScope.CC.s(SubcomposeLayout2, 0, 0, null, new g11(11), 4, null);
                    }
                    Object next2 = it4.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.z0();
                        throw null;
                    }
                    List<Measurable> listSubcompose2 = SubcomposeLayout2.subcompose(vo1.j(i3, "item_"), ComposableLambdaKt.composableLambdaInstance(941899785, true, new xm0((RegularBusProductItemData) next2, 6)));
                    ArrayList arrayList4 = new ArrayList(CollectionsKt.v(listSubcompose2, 10));
                    Iterator<T> it6 = listSubcompose2.iterator();
                    while (it6.hasNext()) {
                        arrayList4.add(((Measurable) it6.next()).mo5939measureBRTryo0(constraints2.getValue()));
                    }
                    arrayList3.add(arrayList4);
                    i3 = i4;
                }
                break;
        }
    }
}
