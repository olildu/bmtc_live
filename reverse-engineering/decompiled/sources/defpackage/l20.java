package defpackage;

import androidx.compose.material3.ExposedDropdownMenuKt;
import androidx.compose.material3.WindowBoundsCalculator;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import app.chalo.premiumbus.data.models.app.PBAvailableSlotsInfoAppModel;
import app.chalo.premiumbus.domain.ODPairWithSlotsListAppModel;
import app.chalo.premiumbus.ui.slotselection.PremiumBusSlotSelectionIntent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlinx.datetime.internal.format.parser.NumberConsumer;
import kotlinx.datetime.internal.format.parser.NumberConsumptionError;
import kotlinx.datetime.internal.format.parser.NumberSpanParserOperation;
import kotlinx.datetime.internal.format.parser.StringSetParserOperation;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l20 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18274a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ l20(int i, int i2, Object obj, Object obj2, Object obj3) {
        this.f18274a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18274a) {
            case 0:
                return ExposedDropdownMenuKt.ExposedDropdownMenuBox$lambda$18$lambda$17((WindowBoundsCalculator) this.c, this.b, (MutableState) this.d, (MutableIntState) this.e);
            case 1:
                String str = (String) this.c;
                NumberSpanParserOperation numberSpanParserOperation = (NumberSpanParserOperation) this.d;
                NumberConsumptionError numberConsumptionError = (NumberConsumptionError) this.e;
                StringBuilder sbQ = nf1.q("Can not interpret the string '", str, "' as ");
                sbQ.append(((NumberConsumer) numberSpanParserOperation.f18035a.get(this.b)).b);
                sbQ.append(": ");
                sbQ.append(numberConsumptionError.a());
                return sbQ.toString();
            case 2:
                ((Function1) this.c).invoke(new PremiumBusSlotSelectionIntent.ViewAllSlotsClickIntent(((ODPairWithSlotsListAppModel) this.d).f7215a, (PBAvailableSlotsInfoAppModel) this.e, this.b));
                return Unit.f17538a;
            default:
                return "Expected " + ((StringSetParserOperation) this.c).b + " but got " + ((CharSequence) this.d).subSequence(this.b, ((Ref.IntRef) this.e).element).toString();
        }
    }

    public /* synthetic */ l20(WindowBoundsCalculator windowBoundsCalculator, int i, MutableState mutableState, MutableIntState mutableIntState) {
        this.f18274a = 0;
        this.c = windowBoundsCalculator;
        this.b = i;
        this.d = mutableState;
        this.e = mutableIntState;
    }

    public /* synthetic */ l20(Function1 function1, ODPairWithSlotsListAppModel oDPairWithSlotsListAppModel, PBAvailableSlotsInfoAppModel pBAvailableSlotsInfoAppModel, int i) {
        this.f18274a = 2;
        this.c = function1;
        this.d = oDPairWithSlotsListAppModel;
        this.e = pBAvailableSlotsInfoAppModel;
        this.b = i;
    }
}
