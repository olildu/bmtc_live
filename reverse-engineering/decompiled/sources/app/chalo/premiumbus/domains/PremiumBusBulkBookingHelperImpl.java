package app.chalo.premiumbus.domains;

import app.chalo.contract.BasicInfoContract;
import app.chalo.models.SuperPassSubTypes;
import app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper;
import app.chalo.superpass.data.repository.SuperPassRepository;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/premiumbus/domains/PremiumBusBulkBookingHelperImpl;", "Lapp/chalo/premiumbus/helper/PremiumBusBulkBookingHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PremiumBusBulkBookingHelperImpl implements PremiumBusBulkBookingHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckIfContinueWithBulkBookingFlowUseCase f7271a;
    public final SuperPassRepository b;
    public final BasicInfoContract c;

    public PremiumBusBulkBookingHelperImpl(CheckIfContinueWithBulkBookingFlowUseCase checkIfContinueWithBulkBookingFlowUseCase, SuperPassRepository superPassRepository, BasicInfoContract basicInfoContract) {
        this.f7271a = checkIfContinueWithBulkBookingFlowUseCase;
        this.b = superPassRepository;
        this.c = basicInfoContract;
    }

    @Override // app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper
    public final Object a(String str, SuperPassSubTypes superPassSubTypes, ContinuationImpl continuationImpl) {
        return this.f7271a.b(str, superPassSubTypes, continuationImpl);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x01df  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x01c9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:? A[LOOP:0: B:97:0x01b7->B:116:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0108 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:? A[LOOP:1: B:59:0x010e->B:119:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:58:0x010a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0114  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:74:0x015b  */
    /* JADX WARN: Code duplicated, block: B:76:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x0193  */
    /* JADX WARN: Code duplicated, block: B:86:0x0196  */
    /* JADX WARN: Code duplicated, block: B:88:0x019b  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:99:0x01bd  */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0194, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        if (r1 == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cb, code lost:
    
        if (r1 == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0140, code lost:
    
        if (r1 == r3) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017e, code lost:
    
        if (r1 == r3) goto L80;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00cb -> B:40:0x00cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x017e -> B:81:0x0181). Please report as a decompilation issue!!! */
    @Override // app.chalo.premiumbus.helper.PremiumBusBulkBookingHelper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.ContinuationImpl r20) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: app.chalo.premiumbus.domains.PremiumBusBulkBookingHelperImpl.b(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
