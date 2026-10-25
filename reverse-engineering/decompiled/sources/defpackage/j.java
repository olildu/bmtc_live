package defpackage;

import android.app.job.JobInfo;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import com.adster.sdk.mediation.AdsCache$put$queue$1$invoke$$inlined$thenBy$1;
import com.bumptech.glide.load.engine.executor.GlideExecutor;
import com.google.ads.interactivemedia.v3.internal.zzrv;
import com.google.android.gms.internal.ads.zzgbb;
import com.google.common.util.concurrent.AbstractListeningExecutorService;
import com.google.common.util.concurrent.ForwardingExecutorService;
import com.google.common.util.concurrent.ForwardingListeningExecutorService;
import com.inmobi.media.G9;
import java.util.Locale;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes7.dex */
public abstract /* synthetic */ class j {
    public static /* synthetic */ JobInfo.TriggerContentUri a(Uri uri, int i) {
        return new JobInfo.TriggerContentUri(uri, i);
    }

    public static /* synthetic */ MediaCodec.CryptoInfo.Pattern b() {
        return new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public static /* synthetic */ LocaleList c(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* synthetic */ LocaleSpan d(LocaleList localeList) {
        return new LocaleSpan(localeList);
    }

    public static /* synthetic */ PriorityQueue e(AdsCache$put$queue$1$invoke$$inlined$thenBy$1 adsCache$put$queue$1$invoke$$inlined$thenBy$1) {
        return new PriorityQueue(adsCache$put$queue$1$invoke$$inlined$thenBy$1);
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g(GlideExecutor glideExecutor) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || glideExecutor != ForkJoinPool.commonPool()) && !(zIsTerminated = glideExecutor.isTerminated())) {
            glideExecutor.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = glideExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        glideExecutor.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void h(zzrv zzrvVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || zzrvVar != ForkJoinPool.commonPool()) && !(zIsTerminated = zzrvVar.isTerminated())) {
            zzrvVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = zzrvVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        zzrvVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void i(zzgbb zzgbbVar) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || zzgbbVar != ForkJoinPool.commonPool()) && !(zIsTerminated = zzgbbVar.isTerminated())) {
            zzgbbVar.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = zzgbbVar.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        zzgbbVar.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void j(AbstractListeningExecutorService abstractListeningExecutorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || abstractListeningExecutorService != ForkJoinPool.commonPool()) && !(zIsTerminated = abstractListeningExecutorService.isTerminated())) {
            abstractListeningExecutorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = abstractListeningExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        abstractListeningExecutorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void k(ForwardingExecutorService forwardingExecutorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || forwardingExecutorService != ForkJoinPool.commonPool()) && !(zIsTerminated = forwardingExecutorService.isTerminated())) {
            forwardingExecutorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = forwardingExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        forwardingExecutorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void l(ForwardingListeningExecutorService forwardingListeningExecutorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || forwardingListeningExecutorService != ForkJoinPool.commonPool()) && !(zIsTerminated = forwardingListeningExecutorService.isTerminated())) {
            forwardingListeningExecutorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = forwardingListeningExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        forwardingListeningExecutorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void m(G9 g9) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || g9 != ForkJoinPool.commonPool()) && !(zIsTerminated = g9.isTerminated())) {
            g9.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = g9.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        g9.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void n(ExecutorService executorService) {
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = executorService.isTerminated())) {
            executorService.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        executorService.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void o() {
    }

    public static /* synthetic */ void p(ExecutorService executorService) {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = (threadPoolExecutor = (ThreadPoolExecutor) executorService).isTerminated())) {
            threadPoolExecutor.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        threadPoolExecutor.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* synthetic */ void q(ExecutorService executorService) {
        ThreadPoolExecutor threadPoolExecutor;
        boolean zIsTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || executorService != ForkJoinPool.commonPool()) && !(zIsTerminated = (threadPoolExecutor = (ThreadPoolExecutor) executorService).isTerminated())) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) executorService;
            scheduledThreadPoolExecutor.shutdown();
            boolean z = false;
            while (!zIsTerminated) {
                try {
                    zIsTerminated = threadPoolExecutor.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z) {
                        scheduledThreadPoolExecutor.shutdownNow();
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
