package app.chalo.home.ui.chalobus;

import app.chalo.features.productsync.constants.SuperPassStatus;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.comparisons.ComparisonsKt;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1$1$invokeSuspend$$inlined$compareBy$1<T> implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        SuperPassStatus superPassStatus = ((ChaloBusPassHistory) obj).e;
        int[] iArr = ChaloBusComponent$fetchChaloBusPassesFromDbIfAvailableAndUpdateState$1.AnonymousClass1.WhenMappings.b;
        int i2 = 2;
        switch (iArr[superPassStatus.ordinal()]) {
            case 1:
                i = 2;
                break;
            case 2:
            case 3:
                i = 1;
                break;
            case 4:
                i = 0;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        Integer numValueOf = Integer.valueOf(i);
        switch (iArr[((ChaloBusPassHistory) obj2).e.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                i2 = 1;
                break;
            case 4:
                i2 = 0;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                i2 = -1;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return ComparisonsKt.a(numValueOf, Integer.valueOf(i2));
    }
}
