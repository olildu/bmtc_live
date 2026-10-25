package defpackage;

import com.google.android.material.color.utilities.ColorUtils;
import com.google.android.material.color.utilities.Contrast;
import com.google.android.material.color.utilities.DynamicScheme;
import com.google.android.material.color.utilities.MaterialDynamicColors;
import com.google.android.material.color.utilities.ToneDeltaPair;
import com.google.android.material.color.utilities.TonePolarity;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class lh0 implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18313a;
    public final /* synthetic */ MaterialDynamicColors b;

    public /* synthetic */ lh0(MaterialDynamicColors materialDynamicColors, int i) {
        this.f18313a = i;
        this.b = materialDynamicColors;
    }

    public /* synthetic */ Function andThen(Function function) {
        int i = this.f18313a;
        return Function$CC.$default$andThen(this, function);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:55:0x0104  */
    /* JADX WARN: Code duplicated, block: B:58:0x011e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0120  */
    /* JADX WARN: Code duplicated, block: B:61:0x0123  */
    /* JADX WARN: Code duplicated, block: B:74:0x0146  */
    /* JADX WARN: Code duplicated, block: B:78:0x014e  */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        double d;
        double d2;
        double dA;
        double dA2;
        double dMax;
        double dA3;
        double dA4;
        boolean z;
        boolean z2;
        int i = this.f18313a;
        MaterialDynamicColors materialDynamicColors = this.b;
        switch (i) {
            case 0:
                materialDynamicColors.g();
                materialDynamicColors.f();
                TonePolarity tonePolarity = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 1:
                materialDynamicColors.k();
                materialDynamicColors.j();
                TonePolarity tonePolarity2 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 2:
                materialDynamicColors.i();
                materialDynamicColors.h();
                TonePolarity tonePolarity3 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 3:
                materialDynamicColors.g();
                materialDynamicColors.f();
                TonePolarity tonePolarity4 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 4:
                return materialDynamicColors.f();
            case 5:
                return materialDynamicColors.a();
            case 6:
                materialDynamicColors.getClass();
                MaterialDynamicColors.d((DynamicScheme) obj);
                throw null;
            case 7:
                return materialDynamicColors.g();
            case 8:
                materialDynamicColors.k();
                materialDynamicColors.j();
                TonePolarity tonePolarity5 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 9:
                return materialDynamicColors.h();
            case 10:
                materialDynamicColors.i();
                materialDynamicColors.h();
                TonePolarity tonePolarity6 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 11:
                return materialDynamicColors.j();
            case 12:
                materialDynamicColors.getClass();
                MaterialDynamicColors.e((DynamicScheme) obj);
                throw null;
            case 13:
                return materialDynamicColors.k();
            case 14:
                DynamicScheme dynamicScheme = (DynamicScheme) obj;
                if (!MaterialDynamicColors.d(dynamicScheme)) {
                    throw null;
                }
                double dDoubleValue = ((Double) materialDynamicColors.i().b.apply(dynamicScheme)).doubleValue();
                if (dDoubleValue >= 0.0d && dDoubleValue <= 100.0d) {
                    d = 4.5d;
                    double dB = ColorUtils.b(dDoubleValue);
                    d2 = 0.4d;
                    double d3 = ((dB + 5.0d) * 4.5d) - 5.0d;
                    if (d3 >= 0.0d && d3 <= 100.0d) {
                        double dB2 = Contrast.b(d3, dB);
                        double dAbs = Math.abs(dB2 - 4.5d);
                        if (dB2 >= 4.5d || dAbs <= 0.04d) {
                            dA = ((ColorUtils.a(d3 / 100.0d) * 116.0d) - 16.0d) + 0.4d;
                            if (dA < 0.0d || dA > 100.0d) {
                            }
                        }
                    }
                    if (dA < 0.0d) {
                        dA = 100.0d;
                    }
                    if (dDoubleValue >= 0.0d || dDoubleValue > 100.0d) {
                        dA2 = -1.0d;
                    } else {
                        double dB3 = ColorUtils.b(dDoubleValue);
                        double d4 = ((dB3 + 5.0d) / d) - 5.0d;
                        if (d4 < 0.0d || d4 > 100.0d) {
                            dA2 = -1.0d;
                        } else {
                            double dB4 = Contrast.b(dB3, d4);
                            double dAbs2 = Math.abs(dB4 - d);
                            if (dB4 >= d || dAbs2 <= 0.04d) {
                                dA2 = ((ColorUtils.a(d4 / 100.0d) * 116.0d) - 16.0d) - d2;
                                if (dA2 < 0.0d || dA2 > 100.0d) {
                                    dA2 = -1.0d;
                                }
                            } else {
                                dA2 = -1.0d;
                            }
                        }
                    }
                    dMax = Math.max(0.0d, dA2);
                    dA3 = Contrast.a(dA, dDoubleValue);
                    dA4 = Contrast.a(dMax, dDoubleValue);
                    z = false;
                    if (Math.round(dDoubleValue) < 60) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (Math.abs(dA3 - dA4) < 0.1d && dA3 < d && dA4 < d) {
                            z = true;
                        }
                        if (dA3 < d && dA3 < dA4 && !z) {
                            dA = dMax;
                        }
                    } else if (dA4 < d || dA4 >= dA3) {
                        dA = dMax;
                    }
                    return Double.valueOf(dA);
                }
                d = 4.5d;
                d2 = 0.4d;
                dA = -1.0d;
                if (dA < 0.0d) {
                    dA = 100.0d;
                }
                if (dDoubleValue >= 0.0d) {
                    dA2 = -1.0d;
                } else {
                    dA2 = -1.0d;
                }
                dMax = Math.max(0.0d, dA2);
                dA3 = Contrast.a(dA, dDoubleValue);
                dA4 = Contrast.a(dMax, dDoubleValue);
                z = false;
                if (Math.round(dDoubleValue) < 60) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (Math.abs(dA3 - dA4) < 0.1d) {
                        z = true;
                    }
                    if (dA3 < d) {
                        dA = dMax;
                    }
                } else if (dA4 < d) {
                    dA = dMax;
                } else {
                    dA = dMax;
                }
                return Double.valueOf(dA);
            case 15:
                return materialDynamicColors.i();
            case 16:
                materialDynamicColors.b();
                materialDynamicColors.a();
                TonePolarity tonePolarity7 = TonePolarity.DARKER;
                return new ToneDeltaPair();
            case 17:
                return materialDynamicColors.b();
            default:
                materialDynamicColors.b();
                materialDynamicColors.a();
                TonePolarity tonePolarity8 = TonePolarity.DARKER;
                return new ToneDeltaPair();
        }
    }

    public /* synthetic */ Function compose(Function function) {
        int i = this.f18313a;
        return Function$CC.$default$compose(this, function);
    }
}
