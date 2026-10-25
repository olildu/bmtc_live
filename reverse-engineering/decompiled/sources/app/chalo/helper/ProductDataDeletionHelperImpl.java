package app.chalo.helper;

import app.chalo.home.data.repository.TicketRepository;
import app.chalo.instantticket.domain.ClearInstantTicketsDuringLogoutUseCase;
import app.chalo.metro.repository.MetroRepository;
import app.chalo.multimodalticket.data.repository.MultiModalGroupTicketRepository;
import app.chalo.ondc.repository.OndcRepository;
import app.chalo.premiumbus.data.PremiumBusDataStoreWrapper;
import app.chalo.premiumbus.prebookedtickets.domain.DeletePremiumReserveTicketsUseCase;
import app.chalo.providers.UserProfileDetailsProvider;
import app.chalo.ridefeedback.domain.ClearRideFeedbackDataDuringLogoutUseCase;
import app.chalo.superpass.data.repository.SuperPassRepository;
import app.chalo.walletframework.wallet.domain.ClearWalletAndQuickPayDuringLogoutUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-768684cd39a5ad1c7d5fcc2f270101f474284688cfb789f364f0693d6cb386f8 */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lapp/chalo/helper/ProductDataDeletionHelperImpl;", "Lapp/chalo/helper/ProductDataDeletionHelper;", "home_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProductDataDeletionHelperImpl implements ProductDataDeletionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserProfileDetailsProvider f2841a;
    public final SuperPassRepository b;
    public final OndcRepository c;
    public final PremiumBusDataStoreWrapper d;
    public final ClearWalletAndQuickPayDuringLogoutUseCase e;
    public final ClearInstantTicketsDuringLogoutUseCase f;
    public final DeletePremiumReserveTicketsUseCase g;
    public final TicketRepository h;
    public final MetroRepository i;
    public final ClearRideFeedbackDataDuringLogoutUseCase j;
    public final MultiModalGroupTicketRepository k;

    public ProductDataDeletionHelperImpl(UserProfileDetailsProvider userProfileDetailsProvider, SuperPassRepository superPassRepository, OndcRepository ondcRepository, PremiumBusDataStoreWrapper premiumBusDataStoreWrapper, ClearWalletAndQuickPayDuringLogoutUseCase clearWalletAndQuickPayDuringLogoutUseCase, ClearInstantTicketsDuringLogoutUseCase clearInstantTicketsDuringLogoutUseCase, DeletePremiumReserveTicketsUseCase deletePremiumReserveTicketsUseCase, TicketRepository ticketRepository, MetroRepository metroRepository, ClearRideFeedbackDataDuringLogoutUseCase clearRideFeedbackDataDuringLogoutUseCase, MultiModalGroupTicketRepository multiModalGroupTicketRepository) {
        this.f2841a = userProfileDetailsProvider;
        this.b = superPassRepository;
        this.c = ondcRepository;
        this.d = premiumBusDataStoreWrapper;
        this.e = clearWalletAndQuickPayDuringLogoutUseCase;
        this.f = clearInstantTicketsDuringLogoutUseCase;
        this.g = deletePremiumReserveTicketsUseCase;
        this.h = ticketRepository;
        this.i = metroRepository;
        this.j = clearRideFeedbackDataDuringLogoutUseCase;
        this.k = multiModalGroupTicketRepository;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d A[PHI: r2
      0x008d: PHI (r2v8 java.lang.String) = (r2v5 java.lang.String), (r2v10 java.lang.String) binds: [B:29:0x0089, B:22:0x0057] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:52:0x00da  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // app.chalo.helper.ProductDataDeletionHelper
    public final Object a(ContinuationImpl continuationImpl) {
        ProductDataDeletionHelperImpl$deleteAllProductsFromDB$1 productDataDeletionHelperImpl$deleteAllProductsFromDB$1;
        String str;
        Object objF;
        Object objE;
        if (continuationImpl instanceof ProductDataDeletionHelperImpl$deleteAllProductsFromDB$1) {
            productDataDeletionHelperImpl$deleteAllProductsFromDB$1 = (ProductDataDeletionHelperImpl$deleteAllProductsFromDB$1) continuationImpl;
            int i = productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = i - Integer.MIN_VALUE;
            } else {
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1 = new ProductDataDeletionHelperImpl$deleteAllProductsFromDB$1(this, continuationImpl);
            }
        } else {
            productDataDeletionHelperImpl$deleteAllProductsFromDB$1 = new ProductDataDeletionHelperImpl$deleteAllProductsFromDB$1(this, continuationImpl);
        }
        Object obj = productDataDeletionHelperImpl$deleteAllProductsFromDB$1.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label;
        OndcRepository ondcRepository = this.c;
        Unit unit = Unit.f17538a;
        switch (i2) {
            case 0:
                ResultKt.b(obj);
                String strM = this.f2841a.m();
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = strM;
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 1;
                if (this.b.b(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    str = strM;
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = str;
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 2;
                    if (ondcRepository.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = null;
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 3;
                        if (this.d.c(str, productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 4;
                            if (this.e.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 5;
                                objF = this.f.f3897a.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                                if (objF != coroutineSingletons) {
                                    objF = unit;
                                }
                                if (objF != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                                    objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                                    if (objE != coroutineSingletons) {
                                        objE = unit;
                                    }
                                    if (objE != coroutineSingletons) {
                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                                        if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                                            if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                                                if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                                    if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                                        if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                                            return unit;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 1:
                str = (String) productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0;
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = str;
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 2;
                if (ondcRepository.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = null;
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 3;
                    if (this.d.c(str, productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 4;
                        if (this.e.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 5;
                            objF = this.f.f3897a.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                            if (objF != coroutineSingletons) {
                                objF = unit;
                            }
                            if (objF != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                                objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                                if (objE != coroutineSingletons) {
                                    objE = unit;
                                }
                                if (objE != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                                    if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                                        if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                                            if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                                if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                                    if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                                        return unit;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 2:
                str = (String) productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0;
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.L$0 = null;
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 3;
                if (this.d.c(str, productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 4;
                    if (this.e.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 5;
                        objF = this.f.f3897a.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                        if (objF != coroutineSingletons) {
                            objF = unit;
                        }
                        if (objF != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                            objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                            if (objE != coroutineSingletons) {
                                objE = unit;
                            }
                            if (objE != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                                if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                                    if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                                        if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                            if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                                if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                                    return unit;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 3:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 4;
                if (this.e.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 5;
                    objF = this.f.f3897a.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                    if (objF != coroutineSingletons) {
                        objF = unit;
                    }
                    if (objF != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                        objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                        if (objE != coroutineSingletons) {
                            objE = unit;
                        }
                        if (objE != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                            if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                                if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                                    if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                        if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                            if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                                return unit;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 4:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 5;
                objF = this.f.f3897a.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                if (objF != coroutineSingletons) {
                    objF = unit;
                }
                if (objF != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                    objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                    if (objE != coroutineSingletons) {
                        objE = unit;
                    }
                    if (objE != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                        if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                            if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                                if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                    if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                        if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                            return unit;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 5:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 6;
                objE = this.g.f7302a.e(productDataDeletionHelperImpl$deleteAllProductsFromDB$1);
                if (objE != coroutineSingletons) {
                    objE = unit;
                }
                if (objE != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                    if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                        if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                            if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                                if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                    if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                        return unit;
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 6:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 7;
                if (this.h.f(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                    if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                        if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                            if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                                if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                    return unit;
                                }
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 7:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 8;
                if (this.i.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                    if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                        if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                            productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                            if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                                return unit;
                            }
                        }
                    }
                }
                return coroutineSingletons;
            case 8:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 9;
                if (this.j.a(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                    if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                        productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                        if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                            return unit;
                        }
                    }
                }
                return coroutineSingletons;
            case 9:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 10;
                if (ondcRepository.h(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) != coroutineSingletons) {
                    productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                    if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                        return unit;
                    }
                }
                return coroutineSingletons;
            case 10:
                ResultKt.b(obj);
                productDataDeletionHelperImpl$deleteAllProductsFromDB$1.label = 11;
                if (this.k.d(productDataDeletionHelperImpl$deleteAllProductsFromDB$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return unit;
            case 11:
                ResultKt.b(obj);
                return unit;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
